/*
 * @Project Name: web-test
 * @File Name: PagePluginConfig.java
 * @Package Name: com.hhly.lqp.spring
 * @Date: 2018年5月7日下午3:07:46
 * @Creator: longqingping-1118
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hhly.lqp.spring;

import java.util.Properties;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.pagehelper.PageInterceptor;

/**
 * TODO
 * @author longqingping-1118
 * @date 2018年5月7日下午3:07:46
 * @see
 */
@Component
public class MybatisConfig {

	@Autowired
	public void setPagePlugin(SqlSessionFactory sqlSessionFactory) {
		PageInterceptor inter = new PageInterceptor();
		Properties pro = new Properties();
		// pro.put("dialect", "mysql");
		pro.put("offsetAsPageNum", "true");
		pro.put("rowBoundsWithCount", "true");
		pro.put("pageSizeZero", "false");
		pro.put("reasonable", "true");
		pro.put("params", "pageNum=start;pageSize=limit;pageSizeZero=zero;reasonable=heli;count=contsql");
		inter.setProperties(pro);
		sqlSessionFactory.getConfiguration().addInterceptor(inter);
	}
}
