package com.App;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.pojo.Student;

public class SortingStudentByComparator {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		List<Student> asList2 = Arrays.asList(

				new Student(1, "Sayantan", "Basirhat", 12345), 
				new Student(2, "Tukai", "Basirhat", 12345),
				new Student(3, "Ranit", "Midnapore", 12345),
				new Student(5, "babai", "blr", 12345),
				new Student(6, "abhilash", "blr", 12345),
				new Student(7, "soumik", "chennai", 12345)
                      );
		
		
		List<Student> collect = asList2.stream().
				sorted(Comparator.comparingInt(Student::getId)).
				collect(Collectors.toList());
		
		
		collect.forEach(s->System.out.println(s.getAddress()));
		
		System.out.println("***********************************");

		
		Map<String, Set<String>> collect2 = asList2.stream().sorted(new Comparator<Student>() {
			
			

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}

		}).collect(Collectors.groupingBy(Student::getAddress, Collectors.mapping(Student::getName, Collectors.toSet())));

		System.out.println("***********************************");

		
		collect2.forEach((k,v)->System.out.println(k+"    "+v));
		
		
		
		
List<Student> collect3 = asList2.stream().sorted(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareToIgnoreCase(o2.getName());
			}

		}).collect(Collectors.toList());


System.out.println("***********************************");

collect3.forEach(co->System.out.println(co.getName()));
		
	}

}
