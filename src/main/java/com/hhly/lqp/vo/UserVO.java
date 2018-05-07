/*
 * @Project Name: web-test
 * @File Name: User.java
 * @Package Name: com.hhly.lqp.bean
 * @Date: 2018年4月19日下午4:19:12
 * @Creator: longqingping-1118
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hhly.lqp.vo;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * TODO
 * @author longqingping-1118
 * @date 2018年4月19日下午4:19:12
 * @see
 */
public class UserVO {

	private Long userId;
	private String name;
	private Integer age;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
