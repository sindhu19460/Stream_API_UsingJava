package StreamFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import Collection.Array;

class Student
{
	int id;
	String sname;
	char grade;
	
	public Student(int id, String sname, char grade) {
		super();
		this.id = id;
		this.sname = sname;
		this.grade = grade;
	}
	
}

public class FlastMapDemo3 {

	public static void main(String[] args) {
		
		List<Student> std1 = new ArrayList<Student>();
		std1.add(new Student(1, "akaay", 'A'));
		std1.add(new Student(2, "Vamika", 'B'));
		std1.add(new Student(3, "Anushka", 'B'));
		
		List<Student> std2 = new ArrayList<Student>();
		std1.add(new Student(4, "Prashi", 'A'));
		std1.add(new Student(5, "Bushi", 'B'));
		std1.add(new Student(6, "sindhu", 'B'));
		
		
		List<List<Student>> studentlist = Arrays.asList(std1,std2);
		
		for(List<Student> s: studentlist)
		{
			for(Student stu:s)
			{
				System.out.println(stu.sname);
			}
		}
		
		List<String> StuName = studentlist.stream().flatMap(stulist->stulist.stream()).map(s->s.sname).collect(Collectors.toList());
		System.out.println(StuName);
		

	}

}
