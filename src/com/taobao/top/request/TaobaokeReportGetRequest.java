package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.taobaoke.report.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TaobaokeReportGetRequest implements TopRequest {

	private String date;
	private String fields;

	public void setDate(String date) {
		this.date = date;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getApiName() {
		return "taobao.taobaoke.report.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("date", this.date);
		params.put("fields", this.fields);
		return params;
	}

}
