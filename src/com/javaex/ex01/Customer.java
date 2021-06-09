package com.javaex.ex01;

public class Customer extends Person{
	
	
	//필드-------------------------------------------------
	private int cNo;
	private int point;
	
	//생성자------------------------------------------------
	
	public Customer() {
		super();
	}

	public Customer(String name, String hp, int cNo, int point) {
		super(name,hp);
		this.cNo = cNo;
		this.point = point;
	}

	
	
	//메소드(게터세터)----------------------------------------
	
	public int getcNo() {
		return cNo;
	}
	
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}

	
	//메소드(일반)-------------------------------------------
	
	@Override
	public String toString() {
		return "Customer [cNo=" + cNo + ", point=" + point + "]";
	}
	
	public void showInfo() {
		System.out.println("#이름: " + super.getName() + " , #핸드폰: " + super.getHp() + " , #고객번호: " + cNo +
				" , #포인트점수: " + point);
	}
	
	//지금 부모의 필드가 private로 잠겨있기때문에 super.getName,getHp로 코딩해줬다. 
	//만약 protected나 public으로 열려있다면 name 또는 this.name도 가능하며 알기쉽게 super.name으로 적는것이 좋을것같다.
	
	
}
