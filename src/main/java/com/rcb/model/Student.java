package com.rcb.model;

public class Student {

	private int stuId;
	private String stuName;
	private String adNo;
	private String adStreet;
	
	private String adCity;
	private int clID;
	private String stuGender;
	private double avgMark;
	
	

	public String getAdStreet() {
		return adStreet;
	}

	public void setAdStreet(String adStreet) {
		this.adStreet = adStreet;
	}

	public double getAvgMark() {
		return avgMark;
	}

	public void setAvgMark(double avgMark) {
		this.avgMark = avgMark;
	}

	public String getStuGender() {
		return stuGender;
	}

	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getAdNo() {
		return adNo;
	}

	public void setAdNo(String adNo) {
		this.adNo = adNo;
	}

	

	public String getAdCity() {
		return adCity;
	}

	public void setAdCity(String adCity) {
		this.adCity = adCity;
	}

	public int getClID() {
		return clID;
	}

	public void setClID(int clID) {
		this.clID = clID;
	}

}
