package org.student;

import org.department.Department;

public class Student extends Department{
public void studentName() {
	System.out.println("Student name:Shanmugapriya");
	
}
public void studentDept() {
	System.out.println("Student Department:Information Technology");
	
}
public void studentId() {
	System.out.println("Student id:A12345");
	
}
public static void main(String[] args) {
	Student st=new Student();
	st.collegeName();
	st.collegeCode();
	st.deptName();
	st.studentName();
	st.studentDept();
	st.studentId();
}
}
