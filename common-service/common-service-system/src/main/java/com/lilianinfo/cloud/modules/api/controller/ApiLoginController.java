package com.lilianinfo.cloud.modules.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lilianinfo.cloud.common.utils.R;
import com.lilianinfo.cloud.common.validator.Assert;
import com.lilianinfo.cloud.modules.api.annotation.AuthIgnore;
import com.lilianinfo.cloud.modules.api.service.TokenService;
import com.lilianinfo.cloud.modules.api.service.UserService;

import java.util.Map;

/**
 * API登录授权
 *
 * @author kaka
 *  
 * @date 2017-03-23 15:31
 */
@RestController
@RequestMapping("/api")
public class ApiLoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private TokenService tokenService;

    /**
     * 登录
     */
    @AuthIgnore
    @PostMapping("login")
    public R login(String mobile, String password){
        Assert.isBlank(mobile, "手机号不能为空");
        Assert.isBlank(password, "密码不能为空");

        //用户登录
        long userId = userService.login(mobile, password);

        //生成token
        Map<String, Object> map = tokenService.createToken(userId);

        return R.ok(map);
    }

}
