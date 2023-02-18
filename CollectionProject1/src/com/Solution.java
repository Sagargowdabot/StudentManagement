package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		Student student1=new Student(21,"sagar");
		Student student2=new Student(23,"Chetan");
		Student student3=new Student(22,"srikanth");
		Map<Integer, Student> map= new LinkedHashMap<Integer,Student>();
		map.put(100, student1);//map.put(100,new Student(21,"Sagar"));
		map.put(101, student2);//map.put(100,new Student(22,"Cethan"));
		map.put(102, student3);//map.put(100,new Student(23,"Sagar"));
		//we cant traverse the map directly we have to convert the map into set
		//Map into Set of keys-> keySET()
		//List & Arraylist -> upcasting
		//traverse keys using for each loop
		//get the value(student object)
		//add it into ArrayList
		//print the Student object(value)
		Set<Integer> keys =map.keySet();//converting the map into set using keySet()
		List<Student> list=new ArrayList<Student>();//crating instence of arraylist & storing into List reference variable(upcasting)
		//travresing the keys
		for (int key : keys) {
			Student student=map.get(key);//getting the value (Student object)
			list.add(student);//adding the value(student object)
			System.out.println(student);//printing the value(Student object)
			System.out.println("=================");
			//scanner
			//Display choice->1:sort based on Age2:sort based on Name
			//Switch-> case->break
			//Collection.sort(list,new sortStudentByAge());->Display the objects
			Scanner scan = new Scanner(System.in);
			System.out.println("1:Sort Based ON age\n2:sort based on Name");
			System.out.println("enter the choice");
			int choice=scan.nextInt();
			switch (choice) {
			case 1: 
				Collections.sort(list,new SortStudentByAge());
				for (Student student4 : list) {
					
					System.out.println(student4);
				}
				break;
				
			
			case 2:
				Collections.sort(list,new SortStudentByName());
				for (Student student5 : list) {
					System.out.println(student5);
					
				}
				break;
				
			default:
				System.out.println("invalid choice");
			}

		}

	}

}
