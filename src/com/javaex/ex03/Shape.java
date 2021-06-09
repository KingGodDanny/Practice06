package com.javaex.ex03;

public class Shape {
	
	//필드-------------------------------
	protected String fillColor;
	protected String lineColor;
	
	
	//생성자--------------------------------
	
	public Shape() {
		super();
		System.out.println("Shape(0)");
	}
	
	public Shape(String fillColor, String lineColor) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("Shape(2)");
	}


	
	//메소드(게터세터)----------------------------
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
	
	//메소드(일반)-------------------------------
}

