package org.student;
import org.college.College;
import org.department.Department;
public class Student extends Department {
	public static void studentName()
	{
		System.out.println("Student name:Jeevitha");
	}
public static void studentDept()
{
	System.out.println("Student dept:DCE");
}
public static void studentId()
{
	System.out.println("Student Id:161790");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student stu=new Student();
stu.studentDept();
stu.studentId();
stu.studentName();
stu.deptName();
stu.collegeCode();
stu.collegeName();
stu.collegeRank();

	}

}
