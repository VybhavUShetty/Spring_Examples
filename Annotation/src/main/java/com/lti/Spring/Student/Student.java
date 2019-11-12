package com.lti.Spring.Student;

public class Student {
	
	private int studentid;
	private String student_name;
	public int getStudentid() {
		return studentid;
	}
	public Student(String student_name) {
		this.student_name = student_name;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	
	public Student(int studentid, String student_name) {
		this.studentid = studentid;
		this.student_name = student_name;
	}
	
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", student_name=" + student_name + "]";
	}
	

}
