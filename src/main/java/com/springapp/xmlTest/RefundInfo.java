/**   
 * @Title: RefundIno.java 
 * @Package com.jd.jr.pay.demo.model 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author mythling   
 * @date 2016年9月26日 下午5:04:01 
 * @version V1.0   
 */
package com.springapp.xmlTest;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @ClassName: RefundInfo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author mythling
 * @date 2016年9月26日 下午5:04:01
 * @version V1.0
 */
@XStreamAlias("refund")
public class RefundInfo {
	private String tradeNum;

	private String tradeType;

	private String oTradeNum;

	private String amount;

	private String currency;

	private String tradeTime;

	private String status;

	/**
	 * @return the tradeNum
	 */
	public String getTradeNum() {
		return tradeNum;
	}

	/**
	 * @param tradeNum
	 *            the tradeNum to set
	 */
	public void setTradeNum(String tradeNum) {
		this.tradeNum = tradeNum;
	}

	/**
	 * @return the tradeType
	 */
	public String getTradeType() {
		return tradeType;
	}

	/**
	 * @param tradeType
	 *            the tradeType to set
	 */
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	/**
	 * @return the oTradeNum
	 */
	public String getoTradeNum() {
		return oTradeNum;
	}

	/**
	 * @param oTradeNum
	 *            the oTradeNum to set
	 */
	public void setoTradeNum(String oTradeNum) {
		this.oTradeNum = oTradeNum;
	}

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the tradeTime
	 */
	public String getTradeTime() {
		return tradeTime;
	}

	/**
	 * @param tradeTime
	 *            the tradeTime to set
	 */
	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
