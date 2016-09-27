package com.springapp.xmlTest;

import java.util.List;

import com.jd.jr.pay.gate.signature.vo.JdPayBaseResponse;

public class QueryRefundNewResponse extends JdPayBaseResponse{

	private static final long serialVersionUID = 7202174286884566369L;
	
	private String version;
	private String merchant;
	
	private String device;
	
	

	private String tradeType;
	private List<RefundInfo> refList;
	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	/**
	 * @return the merchant
	 */
	public String getMerchant() {
		return merchant;
	}
	/**
	 * @param merchant the merchant to set
	 */
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}
	/**
	 * @return the device
	 */
	public String getDevice() {
		return device;
	}
	/**
	 * @param device the device to set
	 */
	public void setDevice(String device) {
		this.device = device;
	}
	/**
	 * @return the tradeType
	 */
	public String getTradeType() {
		return tradeType;
	}
	/**
	 * @param tradeType the tradeType to set
	 */
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	/**
	 * @return the refList
	 */
	public List<RefundInfo> getRefList() {
		return refList;
	}
	/**
	 * @param refList the refList to set
	 */
	public void setRefList(List<RefundInfo> refList) {
		this.refList = refList;
	}
	/** 
	 * @Title:        toString 
	 * @Description:  TODO(这里用一句话描述这个方法的作用) 
	 * @param:        @return    
	 * @throws 
	 * @author       mythling
	 * @Date          2016年9月26日 下午5:19:06 
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QueryRefundNewResponse [version=");
		builder.append(version);
		builder.append(", merchant=");
		builder.append(merchant);
		builder.append(", device=");
		builder.append(device);
		builder.append(", tradeType=");
		builder.append(tradeType);
		builder.append(", refList=");
		builder.append(refList);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
