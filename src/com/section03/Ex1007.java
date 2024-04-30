package com.section03;

public class Ex1007 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello ");
		
		str.append("Programming"); //추가
		System.out.println(str);
		
		str.insert(6, "Java "); //삽입
		System.out.println(str);
		
		str.replace(1,  4, "Good");
		System.out.println(str);
		
		str.delete(1, 5);
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);

	}

}
