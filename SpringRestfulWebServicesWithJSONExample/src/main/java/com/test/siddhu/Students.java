package com.test.siddhu;

public class Students{
	
	int id;
	String studentsName;	
	
	public Students(int i, String studentsName) {
		super();
		this.id = i;
		this.studentsName = studentsName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentsName() {
		return studentsName;
	}
	public void setStudentsName(String studentsName) {
		this.studentsName = studentsName;
	}	
	
}