package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		Customer p1 = new Customer("jws", "j1234", "정우성", 1000);
		Customer p2 = new Customer("yjs", "y2345", "유재석", 2000);
		
		Employee s1 = new Employee("Master", "m7788", "운영자", 5000000);
		
		User[] uArray = new User[3];
		
		uArray[0] = p1;
		uArray[1] = p2;
		uArray[2] = s1;

		//따로 변수 주소를 만들지 않고 부모의 배열방에 바로 집어넣는 방법.
		//uArray[0] = new Customer("jws", "j1234", "정우성", 1000);
		//uArray[1] = new Customer("yjs", "y2345", "유재석", 2000);
		//uArray[2] = new Employee("Master", "m7788", "운영자", 5000000);
		
		
		for(int i=0; i<uArray.length; i++) {
			uArray[i].showInfo();
		}
	}
		
}
