package com.taobao.top.domain;

import java.util.Date;
import com.taobao.top.mapping.ApiClass;
import com.taobao.top.mapping.ApiField;
import com.taobao.top.mapping.ApiListClass;

/**
 * SellerCat Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
@ApiClass("seller_cat")
@ApiListClass("seller_cats")
public class SellerCat extends BaseObject {

	private static final long serialVersionUID = 1L;

	@ApiField("cid")
	private Integer cid;

	@ApiField("created")
	private Date created;

	@ApiField("modified")
	private Date modified;

	@ApiField("name")
	private String name;

	@ApiField("parent_cid")
	private Integer parentCid;

	@ApiField("pic_url")
	private String picUrl;

	@ApiField("sort_order")
	private Integer sortOrder;

	public Integer getCid() {
		return this.cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentCid() {
		return this.parentCid;
	}
	public void setParentCid(Integer parentCid) {
		this.parentCid = parentCid;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public Integer getSortOrder() {
		return this.sortOrder;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}
