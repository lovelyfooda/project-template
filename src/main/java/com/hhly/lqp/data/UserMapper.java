
package com.hhly.lqp.data;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import com.github.pagehelper.Page;
import com.hhly.lqp.entity.User;

@Mapper
public interface UserMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	void insertBatch(List<User> record);

	void updateBatch(List<User> record);

	Page<User> queryPage(RowBounds rowBounds);
}
