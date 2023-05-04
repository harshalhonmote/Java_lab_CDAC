package collectionkd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static Set<Projects> set = new HashSet<>();
	static Scanner sc = new Scanner(System.in);

	public static void displayAll() {
         set.forEach(System.out::println);
	}
	
	public static void addNew() {
		Projects p = new Projects();
		System.out.print("Enter project id: ");
		p.setId(sc.nextInt());
		System.out.print("Enter project title: ");
		p.setTitle(sc.nextLine());
		sc.next();
		System.out.print("Enter project teamSize: ");
		p.setTeamSize(sc.nextInt());
		System.out.print("Enter project Date: ");
		p.setDate(Util.toDate(sc.next()));
		System.out.print("Enter project Technology: ");
		p.setTech(sc.next());
		
		set.add(p);
	
	}

	public static void delete() {
		System.out.print("Enter project id: ");
		int id = sc.nextInt();
		Projects p = new Projects();
		p.setId(id);
	    set.remove(p);
	}
	
	public static void setToArraylist() {
		List<Projects>list = new ArrayList<>();
		//list.addAll(set);
		list = set.stream().collect(Collectors.toList());
		list.forEach(System.out::println);
		System.out.println("-----------------");
		list.sort((x,y)->Util.toString(x.getDate()).compareTo(Util.toString(y.getDate())));
		 list.forEach(System.out::println);
		
	}
	public static void sortAll() {
		//Collections.set
		
	}
	
	public static void main(String[] args) {
		set.add(new Projects(1, "Train", 4, Util.toDate("2023-02-22"), "Java"));
		set.add(new Projects(2, "Airline", 3, Util.toDate("2023-03-21"), ".NET"));
		set.add(new Projects(4, "Online Grocery", 6, Util.toDate("2023-04-12"), "Java"));
		set.add(new Projects(5, "Online Book", 2, Util.toDate("2023-01-14"), ".NET"));
		set.add(new Projects(3, "Online Jewelary", 4, Util.toDate("2023-01-31"), "Java"));
		set.add(new Projects(2, "Bus", 3, Util.toDate("2023-01-31"), "Js"));

		
		//addNew();
		//displayAll();
//		delete();
		//setToArraylist();
		//Projects p = Collections.max(set,(x,y)->x.getTeamSize()-y.getTeamSize());
		//System.out.println(p);
		
		long cnt = set.stream().filter(x->x.getTech().equals("Java")).count();
		System.out.println(cnt);
		//Projects p = new Projects();
		 long sum= set.stream().map(x->x.getTeamSize()).reduce(0,(a,i)->a+i);
		 set.stream().sorted(Comparator.comparing(Projects::getTeamSize));
//parallelStream
		
//		int sum=0;
//		for(Projects p:set) {
//			sum=sum+p.getTeamSize();
//		}
		System.out.println(sum);
	}

}
