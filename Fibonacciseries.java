package CoreJava;

public class Fibonacciseries {
	
	public static void main(String[] args)
	{
		Fibonacciseries f=new Fibonacciseries();
		f.fibonacci();
	}
	
	public void fibonacci()
	{
		int range=8,firstnum=0,secnum=1,sum=0,i;		
		for(i=1;i<=range;i++)
		{
			System.out.println(firstnum);
			sum=firstnum+secnum;
			firstnum=secnum;
			secnum=sum;
		}
	}

}
