/*
 * @Project Name: web-test
 * @File Name: TestInterceptor.java
 * @Package Name: com.hhly.lqp.interceptor
 * @Date: 2018年3月29日下午2:52:32
 * @Creator: longqingping-1118
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hhly.lqp.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * TODO
 * @author longqingping-1118
 * @date 2018年3月29日下午2:52:32
 * @see
 */
public class TestInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("TestInterceptor 执行");
		return true;
		// throw new Exception();
	}
}
