/*
 * @Project Name: spring-test
 * @File Name: WebConfig.java
 * @Package Name: com.hhly.lqp.spring
 * @Date: 2018年3月28日下午12:26:53
 * @Creator: longqingping-1118
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hhly.lqp.spring;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.hhly.lqp.component.HandlerException;
import com.hhly.lqp.component.TestInterceptor;

/**
 * SpringMvc配置类
 * @author longqingping-1118
 * @date 2018年3月28日下午12:26:53
 * @see
 */
@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new TestInterceptor()).addPathPatterns("/user/**");
	}

	@Override
	public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
		resolvers.add(new HandlerException());
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/", ".jsp");
	}

	@Bean(name = "localeResolver")
	public SessionLocaleResolver getLocaleResolver() {
		return new SessionLocaleResolver();
	}
}
