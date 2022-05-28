package com.ques3;

public class Student {

	int roll;
	String name;
	String address;
	String collegeName;
	
	public Student(){
		
	}
	
//	Student(int roll, String name, String address){
//		this.roll=roll;
//		this.name=name;
//		this.address=address;
//		this.collegeName="NIT";
//	}
	
	Student(int roll, String name, String address, String collegeName){
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collegeName=collegeName;
	}
	
	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getCollegeName() {
		return collegeName;
	}
	
	Student(int roll, String name, String address){
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collegeName="NIT";
	}
	
	
	public static Student getStudent(boolean isFromNIT) {
		if(isFromNIT==true) {
			Student students = new Student(1234,"Rahul","Delhi");
			return students;
		} else {
			Student students = new Student(1221,"Saurabh","Bangalore","VIT");
			return students;
		}
	}
	
//	public static void main(String[] args) {
//		Student student = new Student();
//		Student obj = getStudent(true);
//		System.out.println(obj.getName());
//	}

}



