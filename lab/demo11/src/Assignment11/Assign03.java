package Assignment11;

interface Arithmetic{
	double calc(double a, double b);
}

class Main{
	static void calculate(double num1, double num2, Arithmetic op) {
		//double result = op.calc(num1, num2);// (a,b)-> a+b)
		System.out.println("Result: "+ op.calc(num1, num2));
		}
	
}


public class Assign03 {

	public static void main(String[] args) {
		Main.calculate(11, 11, (a,b)-> a+b);
		
		Arithmetic dd = (a,b)-> a+b; 
		Main.calculate(11, 11, dd);
		

	}

}
