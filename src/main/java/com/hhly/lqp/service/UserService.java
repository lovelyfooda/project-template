/*
 * @Project Name: spring-test
 * @File Name: UserService.java
 * @Package Name: com.hhly.lqp.service
 * @Date: 2018年3月21日上午10:50:32
 * @Creator: longqingping-1118
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hhly.lqp.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.hhly.lqp.data.UserMapper;
import com.hhly.lqp.entity.User;

/**
 * 用户服务类
 * @author longqingping-1118
 * @date 2018年3月21日上午10:50:32
 * @see
 */
@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public int insertBatch(List<User> record) {
		userMapper.insertBatch(record);
		return 1;
	}

	public int updateBatch(List<User> record) {
		userMapper.updateBatch(record);
		return 1;
	}

	public int save(User userEntity) {
		return userMapper.insert(userEntity);
	}

	public int insertSelective(User record) {
		return userMapper.insertSelective(record);
	}

	public Page<User> queryPage(Integer pageSize, Integer pageNum) {
		return userMapper.queryPage(new RowBounds(pageNum, pageSize));
	}
}
