package com.javaex.ex06;

public class MyBase extends Base{
	
    //필드
	
	
	//생성자
	
	
	//메소드(게터세터)
	
	
	//메소드(일반)
	
	public void service(String sum) {
		if(sum.equals("오후")) {
			study();
		} else if(sum.equals("낮")) {
			day();
		} else {
			night(); //이처럼 부모의 메소드를 생성자와같이 
		} 
	}
	
	public void study() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}
	
	public void day() {
		System.out.println("낮에는 열심히 수업듣자");
	}
    
}
