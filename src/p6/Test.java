package p6;

import java.util.ArrayList;
import java.util.List;

public class Test {
public static void main(String[] args) {
	Student s1 = new Student("satyam", "90");
	Student s2 = new Student("satyam", "87");
	Student s3 = new Student("satyam", "94");
	Student s4 = new Student("satyam", "55");
	Student s5 = new Student("satyam", "75");
	
	List<Student> list = new ArrayList<>();
	
	   list.add(s1);
	   list.add(s2);
	   list.add(s3);
	   list.add(s4);
	   list.add(s5);

	   
}
}
