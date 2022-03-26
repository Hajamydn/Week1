package week1;

public class Calculator {

	public static void main(String[] args)
	{
		
			Calculator C=new Calculator();
			int A1=20, A2=10;
			double D1=12.5025, D2=10.54545;
			System.out.println("Addition "+C.add(A1, A2));
			System.out.println("Subtraction "+C.sub(D1, D2));
			System.out.println("Multiplication "+C.muliply(A1, A2));
			System.out.println("Division "+C.divide(A1, A2));
	}
	public int add(int a,int b)
	{
		int add = a+b;
		return add;
	}
	
	public double sub(double a, double b)
	{
		double sub=a-b;
		return sub;
	}
	
	public int muliply(int c, int d)
	{
		int mul=c*d;
		return mul;
	}
	
	public int divide(int e, int f)
	{
		int div=e/f;
		return div;
	}
}


