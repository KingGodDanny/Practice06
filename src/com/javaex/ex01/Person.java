package com.javaex.ex01;

public class Person {
	
	//필드---------------------------------------------
	
	private String name;
	private String hp;
	
	
	//생성자--------------------------------------------
	
	public Person() {
		super();
	}

	public Person(String name, String hp) {
		super();
		this.name = name;
		this.hp = hp;
	}
	

	//메소드(겟터셋터)-------------------------------------
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHp() {
		return hp;
	}
	
	public void setHp(String hp) {
		this.hp = hp;
	}
	

	//메소드(일반)----------------------------------------
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + "]";
	}
	

	public void showInfo() {
		System.out.println("#이름: " + name + " , #핸드폰: " + hp);
	}

	
}
