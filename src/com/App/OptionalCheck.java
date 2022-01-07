package com.App;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.pojo.Student;

public class OptionalCheck {

	private static Map<String, Student> hMap = new HashMap<String, Student>();

	public static Map<String, Student> getmap() {

		hMap.put("Tcs", new Student(1, "Sayantan", "Basirhat", 12345));
		hMap.put("Cts", new Student(2, "Tukai", "Basirhat", 12345));
		hMap.put("Hcl", new Student(5, "babai", "blr", 12345));
		hMap.put("Cpg", new Student(6, "abhilash", "blr", 12345));
		hMap.put("TechM", new Student(7, "soumik", "chennai", 12345));

		return hMap;

	}

	public static void main(String[] args) {
		
		hMap=getmap();
		
		String[] arr = {"IBM","Amazon","Tcs","Cts" };
		
		
			/*
		 * Arrays.stream(arr). forEach(arr1->Optional.ofNullable(hMap.get(arr1)).
		 * ifPresent(emp->System.out.print(emp)));
		 */
		 
		
	List<String> list =	Arrays.asList(arr);

		
					
					Optional.ofNullable(list)
	            .orElseGet(Collections::emptyList) // creates empty immutable list: [] in case noteLst is null
	            .stream().forEach(arr1->Optional.ofNullable(hMap.get(arr1)).
	           		  ifPresent(emp->System.out.print(emp)));
	            
	            
	          
	            
		}
  

	

}
