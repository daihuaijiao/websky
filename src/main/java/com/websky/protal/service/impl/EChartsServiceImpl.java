package com.websky.protal.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.websky.mapper.KucunbianhuaMapper;
import com.websky.mapper.SandianMapper;
import com.websky.mapper.SvrMsgTblMapper;
import com.websky.pojo.Kucunbianhua;
import com.websky.pojo.KucunbianhuaExample;
import com.websky.pojo.Sandian;
import com.websky.pojo.SandianExample;
import com.websky.pojo.SvrMsgTbl;
import com.websky.pojo.SvrMsgTblExample;
import com.websky.pojo.SvrMsgTblExample.Criteria;
import com.websky.protal.service.EChartsService;
import com.websky.util.ResultData;

@Service
public class EChartsServiceImpl implements EChartsService {

	@Resource
	private SvrMsgTblMapper svr_mapper;
	
	@Resource
	private KucunbianhuaMapper kc_mapper;
	
	@Resource
	private SandianMapper sd_mapper;
	
	@Override
	public ResultData getEchartData(String type) {
		SvrMsgTblExample example = new SvrMsgTblExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andSvrMsgSeqIsNotNull();
		List<SvrMsgTbl> selectByExample = svr_mapper.selectByExample(example);
		boolean typeIsNull = true;
		if(null != type && !"".equals(type)) {
			typeIsNull = false;
		}
		if(!typeIsNull) {
			
		}
		ResultData result = new ResultData(200, "成功", selectByExample);
		return result;
	}

	@Override
	public ResultData getScatterData() {
		KucunbianhuaExample example = new KucunbianhuaExample();
//		com.websky.pojo.KucunbianhuaExample.Criteria createCriteria = example.createCriteria();
//		createCriteria.
//		example.setDistinct(false);
		example.setGroupByClause("itm_cd");
		List<Kucunbianhua> return_list = kc_mapper.selectByExample(example);
		if(return_list != null && return_list.size() > 0) {
			return new ResultData(200, "成功！", return_list);
		}
		return null;
	}

	@Override
	public ResultData getItemData(String itm_cd) {
		KucunbianhuaExample example = new KucunbianhuaExample();
		com.websky.pojo.KucunbianhuaExample.Criteria createCriteria = example.createCriteria();
		createCriteria.andItmCdEqualTo(itm_cd);
		List<Kucunbianhua> return_list = kc_mapper.selectByExample(example);
		if(return_list != null && return_list.size() > 0) {
			return new ResultData(200, "成功！", return_list);
		}
		return null;
	}

	@Override
	public ResultData getAllItemScatterData() {
		SandianExample example = new SandianExample();
		List<Sandian> return_list = sd_mapper.selectByExample(example);
		if(return_list != null && return_list.size() > 0) {
			return new ResultData(200, "成功！", return_list);
		}
		return new ResultData(300, "失败！", null);
	}

	@Override
	public ResultData getSearchData(String start_price, String end_price, String start_num, String end_num) {
		
		
		
		SandianExample example = new SandianExample();
		com.websky.pojo.SandianExample.Criteria createCriteria = example.createCriteria();
		int s_p = start_price != null && !start_price.equals("") ? Integer.parseInt(start_price) : 0;
		int e_p = end_price != null && !end_price.equals("") ? Integer.parseInt(end_price) : 0;
		int s_n = start_num != null && !start_num.equals("") ? Integer.parseInt(start_num) : 0;
		int e_n = end_num != null && !end_num.equals("") ? Integer.parseInt(end_num) : 0;
		
		if(s_p > e_p) {
			Map<String,Integer> data = new HashMap<String,Integer>();
			data.put("start_price", s_p);
			data.put("end_price", e_p);
			return new ResultData(300, "开始金额不能大于结束金额！", data);
		}
		if(s_n > e_n) {
			Map<String,Integer> data = new HashMap<String,Integer>();
			data.put("start_num", s_n);
			data.put("end_num", e_n);
			return new ResultData(300, "开始数量不能大于结束数量！", data);
		}
		if(e_n > 0) {
			createCriteria.andKcNumBetween(s_n, e_n);
		}
		if(e_p > 0) {
			createCriteria.andTotalBetween((long)s_p, (long)e_p);
		}
		List<Sandian> return_list = sd_mapper.selectByExample(example);
		if(return_list != null && return_list.size() > 0) {
			return new ResultData(200, "成功！", return_list);
		}
		return new ResultData(300, "没有符合条件的数据！", null);
	}

}
