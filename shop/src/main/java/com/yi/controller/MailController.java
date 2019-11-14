package com.yi.controller;

import com.yi.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * @Auther: 小飞
 * @Date: 2019/11/13 09:47
 * @Description:
 */

@Controller
public class MailController {
    @Autowired
    private MailService mailService;

    private Logger logger = LoggerFactory.getLogger(MailController.class);
    @RequestMapping("getCheckCode")
    @ResponseBody
    public String getCheckCode(String email){
        logger.info("邮箱注册码");
        String checkCode = String.valueOf(new Random().nextInt(899999) + 100000);
        String message = "您的注册验证码为："+checkCode;
        try {
            mailService.sendSimpleMail(email, "注册验证码", message);
        }catch (Exception e){
            return "";
        }
        return checkCode;
    }
}