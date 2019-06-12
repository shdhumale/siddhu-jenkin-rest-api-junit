package org.test.siddhu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.siddhu.Students;

@RestController
public class StudentsController {
	
	
	@RequestMapping(value = "/students", method = RequestMethod.GET,headers="Accept=application/json")
	public List<Students> getStudents()
	{
		List<Students> listOfStudents = new ArrayList<Students>();
		listOfStudents=createStudentsList();
		return listOfStudents;
	}

	@RequestMapping(value = "/students/{id}", method = RequestMethod.GET,headers="Accept=application/json")
	public Students getStudentsById(@PathVariable int id)
	{
		List<Students> listOfStudents = new ArrayList<Students>();
		listOfStudents=createStudentsList();

		for (Students students: listOfStudents) {
			if(students.getId()==id)
				return students;
		}
		
		return null;
	}


	public List<Students> createStudentsList()
	{
		Students first=new Students(1, "First");
		Students fourth=new Students(4, "Fourth");
		Students third=new Students(3, "Third");
		Students second=new Students(2, "Second");

		List<Students> listOfStudents = new ArrayList<Students>();
		listOfStudents.add(first);
		listOfStudents.add(second);
		listOfStudents.add(third);
		listOfStudents.add(fourth);
		return listOfStudents;
	}
}
