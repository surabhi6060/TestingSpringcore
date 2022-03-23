package com.springcore;

public class Student {
     private int studentId;
     private String studentName;
     private String studentaddress;
	public Student(int studentId, String studentName, String studentaddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentaddress = studentaddress;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("setting student id");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setStudentName(String studentName) {
		System.out.println("setting student name");
		this.studentName = studentName;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(String studentaddress) {
		System.out.println("setting student address");
		this.studentaddress = studentaddress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentaddress=" + studentaddress
				+ "]";
	}
}
