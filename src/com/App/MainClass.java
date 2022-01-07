package com.App;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.pojo.Student;

public class MainClass {

	public static void main(String[] args) {
	
		
		  
		  List<Student> asList2 = Arrays.asList(
			
			
			  new Student(1, "Sayantan", "Basirhat", 12345), new Student(2, "Tukai",
			  "Basirhat", 12345), new Student(3, "Ranit", "Midnapore", 12345), new
			  Student(5, "babai", "blr", 12345), new Student(6, "abhilash", "blr", 12345),
			  new Student(7, "soumik", "chennai", 12345)
			 
		  
		  );
		List<Student> asList = asList2;
		 
		 
	// grouping by----------------------------------***********------------------------------------------------//	
		
		//Map<String, Set<Student>> collect = asList.stream().collect(Collectors.groupingBy(Student::getAddress,Collectors.toSet()));
		//Map<String, Set<String>> collect2 = asList.stream().collect(Collectors.groupingBy(Student::getAddress,Collectors.mapping(Student::getName, Collectors.toSet())));
		  //Hashtable<String, Set<String>> collect = asList.stream().collect(Collectors.groupingBy(Student::getAddress, Hashtable::new, Collectors.mapping(Student::getName, Collectors.toSet())));
		
		  
		 //// Hashtable<String, Map<Integer, String>> collect = asList.stream().collect(Collectors.groupingBy(Student::getAddress, Hashtable::new, Collectors.toMap(Student::getId, Student::getName)));
		
		  
		  
		//  Map<String, Map<String, String>> collecto = asList.stream().collect(Collectors.groupingBy(Student::getAddress, Hashtable::new, Collectors.toMap(Student::getAddress, Student::getName, (x,y)->x+" and "+y, HashMap::new)));

			
			  
			  
			 // HashMap<String, String> collect2 = asList.stream().collect(Collectors.toMap(Student::getAddress, Student::getName, (x,y)->x+" and "+y, HashMap::new));
			  
			  
			 
		  
 //----------------------------------***********------------------------------------------------//	
		
			 // collecto.forEach((K,V)-> System.out.println("Address is :: " +K+", students are :: "+ V));
		
		
		
		//  Find duplicate --------------------------------------------------*******************--------------------------------------------------
		
		/*
		 * List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
		 * 
		 * Set<Integer> result = findDuplicateByFrequency(list);
		 * 
		 * result.forEach(System.out::println);
		 * 
		 * }
		 * 
		 * public static <T> Set<T> findDuplicateByFrequency(List<T> list) {
		 * 
		 * return list.stream().filter(i -> Collections.frequency(list, i) > 1)
		 * .collect(Collectors.toSet());
		 * 
		 * }
		 */
    
    
    // find Duplicate and Remove Duplicate -----------------------------------------------------******************************************************--------------------------------
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * List<Integer> asList = Arrays.asList(1,1,2,4,5,8,9,5,2,1,2,1,2);
	 * 
	 * Set<Integer> intset = new HashSet<> ();
	 * 
	 * Set<Integer> asList1 =
	 * asList.stream().filter(s->!intset.add(s)).collect(Collectors.toSet());
	 * 
	 * 
	 * System.out.print(intset);
	 * 
	 */
				  
		//-------------------------------------------------------------*******************************************------------------------------  
		  

	List<String> st =	Optional.ofNullable(asList)
            .orElseGet(Collections::emptyList) // creates empty immutable list: [] in case noteLst is null
            .stream() //loop throgh each object and consider non null objects
            .map(s -> s.getName()).collect(Collectors.toList()); // method reference, consider only tag name
	st.forEach(System.out::println);
	}
    
}
