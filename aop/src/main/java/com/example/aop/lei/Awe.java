package com.example.aop.lei;

import java.util.HashMap;

public class Awe {


    public void aa() {
         HashMap<Object, Object> map = new HashMap<>();

        map.put("1", 2);
        System.out.println(map.get("1"));
    }

    public void ab() {
         HashMap<Object, Object> map = new HashMap<>();
        map.put("1", 3);
        System.out.println(map.get("1"));
    }

    public static void main(String[] args) {
        Awe awe = new Awe();
        awe.aa();
        awe.ab();
    }
}
