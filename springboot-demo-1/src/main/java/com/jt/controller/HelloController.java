package com.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//如何为动态属性赋值
	//表达式语法:spel表达式类似于el表达式 ${key}
	//原理:从容器中动态获取名称为demo.name的值为name
	@Value("${demo.name}")
	public String name;
	@Value("${demo.age}")
	public Integer age;
	
	@RequestMapping("hello")
	public String hello() {
		return "hello SpringBoot"+name+":"+age;
	}
}
