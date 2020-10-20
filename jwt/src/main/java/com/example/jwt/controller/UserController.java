package com.example.jwt.controller;

import com.example.jwt.util.JwtUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/jwt")
public class UserController {

    @RequestMapping("/login")
    public HashMap login(String name,String password){
       HashMap map = new HashMap();
        if (name.equals("张三")&&password.equals("123456")){
            String token = JwtUtil.sign(name, password);
            map.put("data",token);
            return map;
        }
        else {
            System.out.println("年号");
            map.put("tip","错误");
            return map;
        }
    }

    @PostMapping("/getUser")
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
