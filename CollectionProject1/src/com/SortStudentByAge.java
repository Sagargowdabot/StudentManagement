package com;

import java.util.Comparator;

public class SortStudentByAge implements Comparator<Student> {//here we implements class with interface

	@Override//we have to follow the contract of abstract
	public int compare(Student o1, Student o2) {//o1->object to be inserted and o2->object already existing
		return o1.age-o2.age;//logic for sortings
	}

}
