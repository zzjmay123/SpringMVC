package com.springapp.mvc;


/**
 * 商品信息
 * @author luanmengting
 *
 */
public class GoodsInfo {
	
	/**
	 * 商品编号
	 */
	private String id;
	
	/**
	 * 商品名称
	 */
	private String name;
	
	/**
	 * 商品一级类目
	 */
	private String cat1;
	
	/**
	 * 商品二级类目
	 */
	private String cat2;
	
	/**
	 * 商品三级类目
	 */
	private String cat3;
	
	/**
	 * 商品类型   GT01:实物,GT02:虚拟
	 */
	private String type;
	
	/**
	 * 商品单价
	 */
	private String price;
	
	/**
	 * 商品数量
	 */
	private String num;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCat1() {
		return cat1;
	}

	public void setCat1(String cat1) {
		this.cat1 = cat1;
	}

	public String getCat2() {
		return cat2;
	}

	public void setCat2(String cat2) {
		this.cat2 = cat2;
	}

	public String getCat3() {
		return cat3;
	}

	public void setCat3(String cat3) {
		this.cat3 = cat3;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

}
