package com.ques3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = Student.getStudent(true);
		
		Student obj1 = Student.getStudent(false);
		
		System.out.println("roll: "+obj.getRoll());
		System.out.println("name: "+obj.getName());
		System.out.println("address: "+obj.getAddress());
		System.out.println("collegeName: "+obj.getCollegeName());
		
		System.out.println("roll: "+obj1.getRoll());
		System.out.println("name: "+obj1.getName());
		System.out.println("address: "+obj1.getAddress());
		System.out.println("collegeName: "+obj1.getCollegeName());
	}
}
