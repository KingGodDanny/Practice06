package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");
		//부모의 String 2개의 생성자가 실행되기떄문에 Shape(2)가 출력된다.
		
		System.out.println("================");
		
		
		
		Triangle t1 = new Triangle();
		//자식의 디폴트생성자를 실행하기때문에 부모의 Shape(0)가 먼저 출력되고
		//Triangle(0)이 출력된다.
		//부모의 디폴트생성자를 없앨경우에 이 디폴트 생성자를 사용할수없다.
		
		System.out.println("================");
		
		
		
		Triangle t2 = new Triangle(3, 4);
		//자식의 int 2개의 생성자가 실행되기때문에 부모의 Shape(2)가 먼저 출력되고
		//Triangle(2)가 출력된다.
		
		System.out.println("================");
		
		
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		//새로 복제된(?)Triangle의 주소를 따라가다보면 부모인 Shape가 있을것이고
		//생성자 4개짜리를 실행하기때문에 부모의 Shape(2)가 먼저 출력되고
		//그다음에 Triangle(4)가 출력된다.
		
		System.out.println("================");
		
	}

}

