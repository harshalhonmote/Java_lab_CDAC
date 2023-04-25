package memberClasses;

public class LocalClass {
    private int nonStaticF=10;
    private static int staticF=100;
	public static void main(String[] args) {
		int local1=10;//Effectively final
		int local2=20;//not final
		local2++;
		
		class Inner{//IT IS INSIDE STATIC MEHTOD THEN BEHAVE AS STATIC CLASS
			
			public void dispaly() {
				System.out.println("Static="+staticF+"local1="+local1);
				//System.out.println("nonStatic="+nonStaticF+"local2="+local2);//error
			}
		}
		Inner in = new Inner();
		in.dispaly();

	}

}
