
package com.test.entry;

import java.io.Serializable;



/**
 * 
 * @ClassName: SaleBean
 * @Description: 售票的bean
 * @author: zhaopo
 * @date: 2016�?11�?30�? 上午10:09:38
 */

public class SaleBean implements Serializable {
	/**
	 * 名字
	 */

	private String name;
	/**
	 * 身份证明
	 */

	private String idCard;
	/**
	 * 电话号码
	 */

	private String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}

