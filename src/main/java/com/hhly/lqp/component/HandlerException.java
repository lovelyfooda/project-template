/*
 * @Project Name: web-test
 * @File Name: HandlerException.java
 * @Package Name: com.hhly.lqp.exception
 * @Date: 2018年3月29日下午5:32:25
 * @Creator: longqingping-1118
 * @line------------------------------
 * @修改人:
 * @修改时间:
 * @修改内容:
 */

package com.hhly.lqp.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * TODO
 * @author longqingping-1118
 * @date 2018年3月29日下午5:32:25
 * @see
 */
public class HandlerException implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		ex.printStackTrace();
		ModelMap model = new ModelMap();
		model.addAttribute("code", 1);
		model.addAttribute("msg", "失败啦");
		MappingJackson2JsonView view = new MappingJackson2JsonView();
		return new ModelAndView(view, model);
	}
}
