/*
 * @Project Name: web-test
 * @File Name: ServletConfig.java
 * @Package Name: com.hhly.lqp.spring
 * @Date: 2018年4月19日下午4:35:51
 * @Creator: longqingping-1118
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hhly.lqp.spring;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Web.xml相关配置
 * @author longqingping-1118
 * @date 2018年4月19日下午4:35:51
 * @see
 */
@Configuration
public class WebConfig {

	/**
	 * 设置dispath的路径
	 * @date 2018年4月19日下午4:38:06
	 * @author longqingping-1118
	 * @since 1.0.0
	 * @param dispatcherServlet
	 * @return
	 */
	@Bean
	public ServletRegistrationBean<DispatcherServlet> dispatcherRegistration(DispatcherServlet dispatcherServlet) {
		ServletRegistrationBean<DispatcherServlet> reg = new ServletRegistrationBean<DispatcherServlet>(
				dispatcherServlet);
		reg.getUrlMappings().clear();
		reg.addUrlMappings("/api/*");
		return reg;
	}
}
