package comparable;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student>{
	private int roll;
	private String name;
	private int std;
	private double marks;
	private String city;
	
	public Student(int roll, String name, int std, double marks,String city) {
		this.roll = roll;
		this.name = name;
		this.std = std;
		this.marks = marks;
		this.city=city;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public int compareTo(Student other) {
		//int diff = this.roll-other.roll;
		int diff;
		diff= this.std-other.std;
		if(diff==0)
           //diff= -Double.compare(this.marks, other.marks);
			diff= -(int)Math.signum(this.marks-other.marks);
		//order by std ASC, marks DESC
		return diff;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", std=" + std + ", marks=" + marks + "city="+city+"]";
	}
	
	
}

class StudentCompatrator implements Comparator<Student>{

	@Override
	public int compare(Student other1, Student other2) {
		int diff;
		diff = -other1.getCity().compareTo(other2.getCity());
		if(diff == 0)
		diff = -Double.compare(other1.getMarks(), other2.getMarks());
		if(diff ==0)
			diff = other1.getName().compareTo(other2.getName());
		
		return diff;
	}
	
}

public class Test {

	public static void main(String[] args) {
		Student[] arr = {
				new Student(5, "James", 5, 8.70,"pune"),
				new Student(1, "Bill", 8, 8.20,"mumabi"),
				new Student(2, "Steve", 5, 8.70,"pune"),
				new Student(4, "Sundar", 8, 8.90,"mumbai"),
				new Student(3, "Parag", 5, 8.30,"solapur")
			};
		Arrays.sort(arr);//comparable
		for(Student s:arr) {
			System.out.println(s);
		}
		System.out.println("------------------------------------");
		Arrays.sort(arr,new StudentCompatrator());//comparator
		for(Student s:arr) {
			System.out.println(s);
		}
		

	}

}
