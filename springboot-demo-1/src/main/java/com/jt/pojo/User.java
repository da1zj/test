package com.jt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data //set/get/toString/equals等
@NoArgsConstructor //无参构造
@AllArgsConstructor //	链式加载,重写set方法
@Accessors(chain = true)
public class User {
	
	private Integer idInteger;
	private String username;
	
	
	
	

}
