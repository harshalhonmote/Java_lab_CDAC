package assignment01;

import java.util.stream.Stream;

public class StreamFacto {

	public static void main(String[] args) {
		/*-----------------------------------------
				int res = Stream.iterate(1, i->i+1)
				      .limit(5)
				      .reduce(1, (a,i)->a*i);
				System.out.println(res);
				
				int sum = Stream.iterate(1,i->i+1)
						.limit(10)
						.reduce(0, Integer::sum);//(a,i)->a+i;
				System.out.println(sum);
				
				Stream<Double> strm1 = Stream.generate(()->Math.random())
						                     .limit(10);
				strm1.forEach(e->System.out.println(e));
		*/
//------------------------------------------------
		String[] names = { "Smita", "Rahul", "Rachana", "Amit", "Shraddha", "Nilesh", "Rohan", "Pradnya", "Rohan",
				"Pooja", "Lalita" };
		Stream sr =Stream.of(names);
		      sr.forEach(e->System.out.println(e));
		      
		     Stream.of(names)
		     .filter(s->s.endsWith("a"))
		     .forEach(e->System.out.println(e));
		     
		     Stream.of(names)
		           .map(s->s.toUpperCase())
		           .forEach(e->System.out.println(e));
		     
		     Stream.of(names)
		           .sorted((x,y)->x.compareToIgnoreCase(y))
		           .forEach(e->System.out.println(e));
		
		     
		     Stream.of(names)
		           .skip(3)
		           .limit(5)
		           .map(s->s.toUpperCase())
		           .sorted((x,y)->x.compareTo(y))
		           .forEach(e->System.out.println(e));
		     //.distinct, .count,
		     long cnt = Stream.of(names)
		    		 .count();
		    		 System.out.println(cnt);

	}

}
