package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.postage.add
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class PostageAddRequest implements TopRequest {

	private String emsIncrease;
	private String emsPrice;
	private String expressIncrease;
	private String expressPrice;
	private String memo;
	private String name;
	private String postIncrease;
	private String postPrice;
	private String postageModeDests;
	private String postageModeIncreases;
	private String postageModePrices;
	private String postageModeTypes;

	public void setEmsIncrease(String emsIncrease) {
		this.emsIncrease = emsIncrease;
	}
	public void setEmsPrice(String emsPrice) {
		this.emsPrice = emsPrice;
	}
	public void setExpressIncrease(String expressIncrease) {
		this.expressIncrease = expressIncrease;
	}
	public void setExpressPrice(String expressPrice) {
		this.expressPrice = expressPrice;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPostIncrease(String postIncrease) {
		this.postIncrease = postIncrease;
	}
	public void setPostPrice(String postPrice) {
		this.postPrice = postPrice;
	}
	public void setPostageModeDests(String postageModeDests) {
		this.postageModeDests = postageModeDests;
	}
	public void setPostageModeIncreases(String postageModeIncreases) {
		this.postageModeIncreases = postageModeIncreases;
	}
	public void setPostageModePrices(String postageModePrices) {
		this.postageModePrices = postageModePrices;
	}
	public void setPostageModeTypes(String postageModeTypes) {
		this.postageModeTypes = postageModeTypes;
	}

	public String getApiName() {
		return "taobao.postage.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("ems_increase", this.emsIncrease);
		params.put("ems_price", this.emsPrice);
		params.put("express_increase", this.expressIncrease);
		params.put("express_price", this.expressPrice);
		params.put("memo", this.memo);
		params.put("name", this.name);
		params.put("post_increase", this.postIncrease);
		params.put("post_price", this.postPrice);
		params.put("postage_mode_dests", this.postageModeDests);
		params.put("postage_mode_increases", this.postageModeIncreases);
		params.put("postage_mode_prices", this.postageModePrices);
		params.put("postage_mode_types", this.postageModeTypes);
		return params;
	}

}
