package com.august.cms.service;
import com.august.cms.domain.*;
import com.august.cms.exception.BusinessException;
import com.august.cms.exception.BusinessExceptionCode;
import com.august.cms.mapper.*;
import com.august.cms.req.UserLoginReq;
import com.august.cms.resp.UserLoginResp;
import com.august.cms.utils.CopyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.repository.util.QueryExecutionConverters;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author August
 * @date 2021/9/17 16:59
 * @lastEditors: August
 * @version:1.0
 */
@Service
public class UserService {
    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
    @Resource
    UserInfoMapper userInfoMapper;

    /**
     * 查找用户名
     *
     * @param userName
     * @return
     */
    public UserInfo selectByUserName(String userName) {
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andUsernameEqualTo(userName);
        List<UserInfo> userList = userInfoMapper.selectByExample(userInfoExample);
        if (CollectionUtils.isEmpty(userList)) {
            return null;
        } else {
            return userList.get(0);
        }
    }
    /**
     * 登录
     */
    public UserLoginResp login(UserLoginReq req) {
        UserInfo userDb = selectByUserName(req.getUserName());
        if (ObjectUtils.isEmpty(userDb)) {
            // 用户名不存在
            LOG.info("用户名不存在, {}", req.getUserName());
            throw new BusinessException(BusinessExceptionCode.LOGIN_USER_ERROR);
        } else {
            if (userDb.getPassword().equals(req.getUserPassword())) {
                // 登录成功

                UserLoginResp userLoginResp = CopyUtils.copy(userDb, UserLoginResp.class);
                userLoginResp.setId(userDb.getId());
                userLoginResp.setUserName(userDb.getUsername());
                return userLoginResp;
            } else {
                // 密码不对
                LOG.info("密码不对, 输入密码：{}, 数据库密码：{}", req.getUserPassword(), userDb.getPassword());
                throw new BusinessException(BusinessExceptionCode.LOGIN_USER_ERROR);
            }
        }

    }


}
