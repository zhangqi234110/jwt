package com.example.aop.controller;

import com.example.aop.util.JwtUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.util.Strftime;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/jwt")
@Api(value = "jwt测试")
public class UserController {

    @RequestMapping("/login")
    @ApiOperation(value = "方法测试1")
    public Map login(String name,String password){
        if (name.equals("张三")&&password.equals("123456")){
            String token = JwtUtil.sign(name, password);
            HashMap<Object, Object> map = new HashMap<>();
            map.put("data",token);
            return map;
        }else if( name.equals("李四")&&password.equals("654321")){
            String token = JwtUtil.sign(name, password);
            HashMap<Object, Object> map = new HashMap<>();
            map.put("data",token);
            return map;
        }
        else {
            return (Map) new HashMap().put("tip","错误");
        }
    }

    @PostMapping("/getUser")
    @ApiOperation(value = "方法测试1")
    public Map getUserInfo(HttpServletRequest request,String name){
        String token = request.getHeader("token");
        boolean verity = JwtUtil.verity(token);
        if (verity) {
            if (name.equals("张三")) {
                HashMap<Object, Object> map = new HashMap<>();
                map.put("data","成功");
                return map;
            }else if (name.equals("李四")){
                HashMap<Object, Object> map = new HashMap<>();
                map.put("data","成功");
                return map;
            }
            else {
                return (Map) new HashMap().put("tip","错误");

            }
        }
        return (Map) new HashMap().put("tip","错误");
    }
}
