package java_school;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}

}

// Complete the code

class CompareStudent implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getCgpa() < o2.getCgpa()) {
			return 1;
		} else if (o1.getCgpa() > o2.getCgpa()) {
			return -1;
		} else {
			if (o1.getFname().equals(o2.getFname())) {
				/*
				 * id is integer and could be return the difference
				 * 
				 * if (o1.getId() > o2.getId()) { return 1; } else { return -1;
				 * }
				 */
				return o1.getId() - o2.getId();
			} else {
				return o1.getFname().compareTo(o2.getFname());
			}
		}
	}

}

public class JavaSort {

	public static void main(String[] args) throws FileNotFoundException {
		File fin = new File("/home/veronica/exercices/java/github/java_school/src/java_school/data/imputJavaSort");
		Scanner in = new Scanner(fin);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		in.close();
		/*
		 * CompareStudent compareSt = new CompareStudent();
		 * studentList.sort(compareSt);
		 *
		 * remove declaration of new instance of CompareStudent class could be
		 * introduce as parameter
		 */
		// studentList.sort(new CompareStudent());
		/*
		 * or use Collections class
		 */
		// Collections.sort(studentList, new CompareStudent());
		/*
		 * use steams class
		 * 
		 */
		studentList.stream().sorted(new CompareStudent()).forEach(s -> System.out.println(s.getFname()));
		for (Student st : studentList) {
			System.out.println(st.getId() + st.getFname() + st.getCgpa());
		}
	}

}
