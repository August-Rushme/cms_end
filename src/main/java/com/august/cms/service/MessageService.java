package com.august.cms.service;

import com.august.cms.domain.Message;
import com.august.cms.mapper.MessageMapper;
import com.august.cms.req.GoodsReq;
import com.august.cms.req.MessageReq;
import com.august.cms.resp.GoodsResp;
import com.august.cms.resp.PageResp;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author August
 * @date 2021/9/29 17:36
 * @lastEditors: August
 * @version:1.0
 */
@Service
public class MessageService {
    @Resource
    MessageMapper messageMapper;
    public PageResp<Message> getMessageList(MessageReq req) {
        Page<Object> page = PageHelper.startPage(req.getPageNum(), req.getPageSize());
        List<Message> messages = messageMapper.selectByExample(null);
        PageResp<Message> pageResp = new PageResp<>();
        pageResp.setTotal(page.getTotal());
        pageResp.setList(messages);
        return pageResp;

    }


    public void save(Message req) {
        messageMapper.insertSelective(req);
    }

    public void update(Message req) {
        messageMapper.updateByPrimaryKeySelective(req);
    }

    public void removeByIds(Integer id) {
        messageMapper.deleteByPrimaryKey(id);
    }
}
