package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.shipping.addresses.get
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ShippingAddressesGetRequest implements TopRequest {

	private String fields;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getApiName() {
		return "taobao.shipping.addresses.get";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("fields", this.fields);
		return params;
	}

}
