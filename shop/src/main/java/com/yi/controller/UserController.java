package com.yi.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.stereotype.Controller;

/**
 * @Auther: 小飞
 * @Date: 2019/11/1 16:37
 * @Description:
 */

@Controller
@Api(description = "用户相关接口")
public class UserController {

    @ApiImplicitParams(
            @ApiImplicitParam(name = "测试",value = "name")
    )
    public void name(){
        System.out.println("111");
    }

}
