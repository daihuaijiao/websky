package com.websky.protal.service;

import com.websky.util.ResultData;

public interface EChartsService {

	ResultData getEchartData(String type);
	ResultData getScatterData();
	ResultData getItemData(String itm_cd);
	
	ResultData getAllItemScatterData();
	
	ResultData getSearchData(String start_price, String end_price, String start_num, String end_num);
	
}
