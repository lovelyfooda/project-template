/*
 * @Project Name: web-test
 * @File Name: PersistenceConfig.java
 * @Package Name: com.hhly.lqp.spring
 * @Date: 2018年4月19日下午4:24:43
 * @Creator: longqingping-1118
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hhly.lqp.spring;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: PersistenceConfig
 * @Description: 数据持久化配置
 * @author longqingping
 * @date 2016年10月18日 下午4:20:10
 */
@Configuration
public class PersistenceConfig {

	@Bean
	public DataSource dataSource(ApplicationProperties pro) {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(pro.driverClassName);
		dataSource.setUrl(pro.url);
		dataSource.setUsername(pro.username);
		dataSource.setPassword(pro.password);
		dataSource.setInitialSize(pro.initialSize);
		// dataSource.setMaxActive(pro.maxActive);
		dataSource.setMaxIdle(pro.maxIdle);
		dataSource.setMinIdle(pro.minIdle);
		return dataSource;
	}
}
