package com.datahub.data.rest;

import com.datahub.data.RespEntity;
import com.datahub.data.util.CookieUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class LoginController {

    @PostMapping("/login1")
    public RespEntity<String> login() {


        return RespEntity.ok("admin-token");

    }

    @GetMapping("/info")
    public RespEntity<Map> info(HttpServletRequest request, HttpServletResponse response) {
        String cookie = CookieUtils.getCookie(request, "vue_admin_template_token");
        System.err.println(cookie);

        CookieUtils.writeCookie(response, "nihao", "nihao");
//        roles: ['admin'],
//        introduction: 'I am a super administrator',
//                avatar: 'https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif',
//                name: 'Super Admin'

        Map map = new HashMap();
        map.put("roles", Arrays.asList("admin"));
        map.put("introduction", "I am a super administrator");
        map.put("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        map.put("name", "Super Admin");

        return RespEntity.ok(map);

    }


    @PostMapping("/logout")
    public RespEntity<String> logout() {
        return RespEntity.ok("ok");

    }


}
