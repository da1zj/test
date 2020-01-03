package com.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:/properties/student.properties")
public class StudentController {
	@Value("${student.id}")
	private Integer id;
	@Value("${student.name}")
	private String name;
	
	@RequestMapping("getStudent")
	public String getMsg() {
		return id+name;
	}

}
