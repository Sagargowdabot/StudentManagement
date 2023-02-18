package com;

import java.util.Comparator;

public class SortStudentByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);//for string sorting we make use of compareTo()
	}
	
	

}
