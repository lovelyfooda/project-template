/*
 * @Project Name: spring-test
 * @File Name: UserController.java
 * @Package Name: com.hhly.lqp.controller
 * @Date: 2018年3月28日下午3:26:31
 * @Creator: longqingping-1118
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hhly.lqp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.hhly.lqp.entity.User;
import com.hhly.lqp.service.UserService;
import com.hhly.lqp.vo.UserVO;

/**
 * TODO
 * @author longqingping-1118
 * @date 2018年3月28日下午3:26:31
 * @see
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/save")
	public String saveUser(@Valid UserVO user) {
		List<User> users = new ArrayList<User>();
		User entity = new User();
		entity.setName("王五");
		entity.setAge(26);
		User entity1 = new User();
		entity1.setName("李四");
		entity1.setAge(32);
		users.add(entity);
		users.add(entity1);
		userService.insertSelective(entity);
		return String.valueOf(userService.insertBatch(users));
	}

	@GetMapping("/update")
	public String updateUser() {
		List<User> users = new ArrayList<User>();
		User entity = new User();
		entity.setId(13);
		entity.setAge(33);
		User entity1 = new User();
		entity1.setId(15);
		entity1.setAge(66);
		users.add(entity);
		users.add(entity1);
		return String.valueOf(userService.updateBatch(users));
	}

	@GetMapping("/query")
	public Page<User> queryUser() {
		Page<User> page = userService.queryPage(1, 2);
		System.out.println(page.getPages());
		return page;
	}
}
