package com.websky.protal.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.websky.pojo.User;
import com.websky.protal.service.EChartsService;
import com.websky.util.ResultData;

/**
 * echarts控制层
 * @addDate： 2018年1月23日
 * @autho： add by daihj
 * @version： 1.0
 */
@Controller
public class EChartsController {

	@Resource
	private EChartsService echartsService;
	
	@RequestMapping("/protal/getEChartData.action")
	@ResponseBody
	public ResultData getEchartData(String types) {
		return echartsService.getEchartData(types);
	}
	
	@RequestMapping("/protal/getScatterData.action")
	@ResponseBody
	public ResultData getScatterData() {
		return echartsService.getScatterData();
	}
	
	/**
	 * 取指定物料数据
	 * @addDate： 2018年1月23日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param itm_cd
	 * @return
	 */
	@RequestMapping("/protal/getItemData.action")
	@ResponseBody
	public ResultData getItemData(String itm_cd) {
		return echartsService.getItemData(itm_cd);
	}
	
	/**
	 * 取所有物料数据
	 * @addDate： 2018年1月23日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@RequestMapping("/protal/getAllItemScatterData.action")
	@ResponseBody
	public ResultData getAllItemScatterData() {
		return echartsService.getAllItemScatterData();
	}
	
	/**
	 * 登录验证
	 * @addDate： 2018年1月23日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param user
	 * @param request
	 * @return
	 */
	@RequestMapping("/protal/logInCheck.action")
	@ResponseBody
	public ResultData logInCheck(User user, HttpServletRequest request) {
		List<String> users = new ArrayList<String>();
		List<String> pwd = new ArrayList<String>();
		users.add("WEBSKY");
		users.add("TOTO");
		pwd.add("WEBSKY");
		pwd.add("TOTO");
		if(user != null ) {
			if(user.getUsername() != null && users.contains(user.getUsername())) {
				if(user.getPassword() != null && users.contains(user.getPassword()) ) {
					request.getSession().setAttribute("username", user.getUsername());
					return new ResultData(200, "登录成功！", user);
				} else {
					return new ResultData(300, "登录失败，密码错误！", user);
				}
			} else {
				return new ResultData(300, "登录失败，用户名错误！", user);
			}
		} else {
			return new ResultData(300, "登录失败！", user);
		}
	}
	
	/**
	 * 登录跳转
	 * @addDate： 2018年1月23日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @param request
	 * @return
	 */
	@RequestMapping("/protal/login.action")
	public String logIn(HttpServletRequest request) {
		String username = (String) request.getSession().getAttribute("username");
		if(username == null || username.equals("")) {
			return "/protal/error.jsp";
		} else {
			request.getSession().setAttribute("username", username);
			return "/protal/panel.jsp";
		}
//		return "redirect:/web-inf/jsp/protal/index.jsp";
	}
	
	/**
	 * 筛选数据
	 * @addDate： 2018年1月23日
	 * @autho： add by daihj
	 * @version： 1.0
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/protal/getSearchData.action")
	public ResultData getSearchData(String start_price, String end_price, String start_num, String end_num) {
		return echartsService.getSearchData(start_price, end_price, start_num, end_num);
	}
	
}
