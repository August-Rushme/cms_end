package com.august.cms.controller;

import com.august.cms.domain.Message;
import com.august.cms.req.GoodsReq;
import com.august.cms.req.MessageReq;
import com.august.cms.resp.CommonResp;
import com.august.cms.resp.GoodsResp;
import com.august.cms.resp.PageResp;
import com.august.cms.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDateTime;

/**
 * @author August
 * @date 2021/9/29 17:35
 * @lastEditors: August
 * @version:1.0
 */
@RestController
@RequestMapping("/api/v1/message")
public class MessageController {
    @Resource
    MessageService messageService;
    private static final Logger LOG = LoggerFactory.getLogger(MessageController.class);
    /**
     * 获取留言列表
     * @param
     * @return
     */
    @PostMapping("/list")
    public CommonResp getMessage(@RequestBody MessageReq req){
        CommonResp<Object> resp = new CommonResp<>();
        PageResp<Message> goodsList = messageService.getMessageList(req);
        resp.setData(goodsList);
        return resp;
    }
    @PostMapping("/save")
    public CommonResp save(@RequestBody Message req){
        if (req.getCreatedat()==null){
            req.setCreatedat(LocalDateTime.now());
        }
        req.setUpdatedat(LocalDateTime.now());
        CommonResp<Object> resp = new CommonResp<>();
       messageService.save(req);
        resp.setMessage("提交成功");
        return resp;
    }
    @PostMapping("/update")
    public CommonResp update(@RequestBody Message req){
        req.setUpdatedat(LocalDateTime.now());
        CommonResp<Object> resp = new CommonResp<>();
        messageService.update(req);
        resp.setMessage("编辑成功");
        return resp;
    }
    @DeleteMapping("/delete/{id}")
    public CommonResp delete(@PathVariable("id") Integer id) {
        CommonResp<Object> resp = new CommonResp<>();
        messageService.removeByIds(id);
        resp.setMessage("删除成功");
        return resp;
    }
}
