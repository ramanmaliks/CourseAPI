package com.restapi.booksapi.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.restapi.booksapi.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	List<Courses> list;
	
	//constructor
	
	public CourseServiceImpl() {
	list = new ArrayList<>();
	list.add(new Courses(145,"Java Core","This course is core Java"));
	list.add(new Courses(2342,"SpringBoot","This is Spring Boot Course"));
	}
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Courses getCourses(long courseId) {
		Courses c = null;
		for(Courses courses:list)
		{
			if(courses.getId()==courseId)
			{
				c=courses;
				break;
				
			}
		}
		return c;
	}
	
	
	public Courses addCourse(Courses courses) {
		list.add(courses);
		return null;
	}

	@Override
	public Courses updateCourse(Courses course) {
		list.forEach(e->{
			if(e.getId()== course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
			
		});
		return course;
	}
	@Override
	public void deleteCourse(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	}

}
