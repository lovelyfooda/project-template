/*
 * @Project Name: web-test
 * @File Name: ApplicationProperties.java
 * @Package Name: com.hhly.lqp.spring
 * @Date: 2018年4月19日下午5:15:22
 * @Creator: longqingping-1118
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hhly.lqp.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 服务器配置
 * @author longqingping-1118
 * @date 2018年4月19日下午5:15:22
 * @see
 */
@Component
public class ApplicationProperties {

	@Value("${jdbc.driverClassName}")
	public String driverClassName;
	@Value("${jdbc.url}")
	public String url;
	@Value("${jdbc.username}")
	public String username;
	@Value("${jdbc.password}")
	public String password;
	@Value("${jdbc.initialSize}")
	public int initialSize;
	@Value("${jdbc.maxActive}")
	public int maxActive;
	@Value("${jdbc.minIdle}")
	public int minIdle;
	@Value("${jdbc.maxIdle}")
	public int maxIdle;
}
