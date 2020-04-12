/**
 * use sort by natural order 
 * inherit compare
 */
package java_school;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student_1 implements Comparable<Student_1> {
	private int id;
	private String fname;
	private double cgpa;

	public Student_1(int id, String fname, double cgpa) {
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

	@Override
	public int compareTo(Student_1 s) {
		if (!(new Double(s.getCgpa()).compareTo(new Double(this.cgpa)) == 0)) {
			return new Double(s.getCgpa()).compareTo(new Double(this.cgpa));
		} else if (this.fname.compareTo(s.getFname()) != 0) {
			return this.fname.compareTo(s.getFname());
		} else {
			return this.id - s.getId();
		}
	}

}

public class JavaSort_1 {

	public static void main(String[] args) {
		File fin = new File("/home/veronica/exercices/java/github/java_school/src/java_school/data/imputJavaSort");
		try {
			Scanner in = new Scanner(fin);
			int testCases = Integer.parseInt(in.nextLine());

			List<Student_1> studentList = new ArrayList<Student_1>();
			while (testCases > 0) {
				int id = in.nextInt();
				String fname = in.next();
				double cgpa = in.nextDouble();

				Student_1 st = new Student_1(id, fname, cgpa);
				studentList.add(st);

				testCases--;
			}

			in.close();

			Collections.sort(studentList);

			for (Student_1 st : studentList) {
				System.out.println(st.getId() + st.getFname() + st.getCgpa());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}