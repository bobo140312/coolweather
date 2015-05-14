package com.coolweather.app.model;
/**
 * 每张表在代码中最好能有一个对应的实体类，这样会非常方便于我们后续的开发
	工作
 * @author bobo
 *
 */
public class Province {
	private int id;
	private String provinceName;
	private String provinceCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
