package com.websky.protal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * Title:PageController
 * @author melody
 * 2017年8月15日
 * Add by daihj
 *
 */
@Controller
public class PageController {
	
	/**
	 * 打开首页
	 * Title:index
	 * @author melody
	 * 2017年8月21日
	 * Add by daihj
	 * Return:String
	 *
	 * @return
	 */
	@RequestMapping("/")
	public String showIndex() {
		return "/index.jsp";
	}

	/**
	 * 打开后台首页
	 * Title:showIndex
	 * @author melody
	 * 2017年8月21日
	 * Add by daihj
	 * Return:String
	 *
	 * @return
	 */
	@RequestMapping("/admin.action")
	public String showManager() {
		return "/admin/admin.jsp";
//		return "admin";
	}
	
	/**
	 * 展示其它页面
	 * Title:showPage
	 * @author melody
	 * 2017年8月21日
	 * Add by daihj
	 * Return:String
	 *
	 * @param page
	 * @return
	 */
//	@RequestMapping("/{page}")
//	public String showPage(@PathVariable String page) {
//		return "/admin/" + page;
//	}
}
