package com.example.aop.lei;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ShuXing {

    @Value("${student.name}")
    private String name;

    @Value("${student.age}")
    private String age;

    public ShuXing() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
