package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Course {
	Integer id;
	String name;
	Double fees;
	public Object fee;

	public Course(Integer id, String name, Double fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}

}

interface CourseService {
	String addCourse(Course c);

	String deleteCourse(Integer cid);

	String updateCourse(Integer cid);

	List<Course> listCourses();

}

class CourseServiceImpl implements CourseService {
	List<Course> courseList = new ArrayList<>();

	public String addCourse(Course c) {
		courseList.add(c);
		return "Course added successfully";
	}

	public String deleteCourse(Integer cid) {
		Iterator i = courseList.iterator();
		while (i.hasNext()) {
			Course course = (Course) i.next();
			if (course.id == cid)
				i.remove();
		}
		return "removed sucessfully";

	}

	public String updateCourse(Integer cid) {
		Iterator i = courseList.iterator();
		while (i.hasNext()) {
			Course course = (Course) i.next();
			if (course.id == cid)
				course.fee = course.fee + 1000;
		}

		return "ok";
	}

	public List<Course> listCourses() {
		return courseList;

	}
}

//ui,test,run,client
public class CourseDemo {
	public static void main(String[] args) {
		Course c1 = new Course(40, "Angular", 5000.00);
		Course c2 = new Course(41, "React", 5000.00);
		CourseService cs = new CourseServiceImpl();
		System.out.println(cs.addCourse(c1));
		System.out.println(cs.addCourse(c2));
		System.out.println(cs.deleteCourse(40));
		List<Course> returnedList = cs.listCourses();
		for (Course c : returnedList)
			System.out.println(c);

	}
}
