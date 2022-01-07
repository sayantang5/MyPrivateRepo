package com.App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.pojo.Department;
import com.pojo.Student;

public class FlatMapJava8Example {
	
	
	public static void main(String [] args)
	{
		

		List<Student> l2 = new ArrayList<>();
		Student stu3 = new Student(3,"d","g",123);
		Student stu4 = new Student(4,"i","k",123);
		l2.add(stu3);
		l2.add(stu4);
		
		
		List<Student> l1 = new ArrayList<>();
		Student stu1 = new Student(1,"a","c",122);
		Student stu2 = new Student(2,"d","e",123);
		l1.add(stu1);
		l1.add(stu2);
		
		

		
		
		Department depr2 = new Department();
		depr2.setDeptId(2);
		depr2.setDeptname("IT");
		depr2.setStudentlist(l2);
		
		Department depr1 = new Department();
		depr1.setDeptId(1);
		depr1.setDeptname("Electronics");
		depr1.setStudentlist(l1);

		
		
		List<Department> dist = Arrays.asList(depr1,depr2);
		
		List<Long> l= dist.stream().flatMap(map->map.getStudentlist().stream()).
				map(obj->obj.getPhno()).collect(Collectors.toList());
		 
		
		System.out.print(l);
		
		
		
	}

}
