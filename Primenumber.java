package CoreJava;

public class Primenumber {
	
	public static void main(String[] args)
	{
		Primenumber Pn= new Primenumber();
		
	}

	//Create constructor to call when create object
	public Primenumber()
	{
		int prime=23,i;
		boolean flag=true;
		
		for(i=2;i<prime;i++)
		{
			if(prime%i==0)
			{
					System.out.println("Not a prime number");
					flag=false;
					break;
			}
		}
		if(flag)
		{
		System.out.println("Prime number ");
		}
	}

}
