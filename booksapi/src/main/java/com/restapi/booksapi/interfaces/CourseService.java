package com.restapi.booksapi.interfaces;

import java.util.List;


import com.restapi.booksapi.entities.Courses;

public interface CourseService {

	public List<Courses> getCourses();

	public Courses getCourses(long courseId);

	public Courses addCourse(Courses courses);

	

	public Courses updateCourse(Courses course);

	public void deleteCourse(long parseLong);
	

	

	


}
	
