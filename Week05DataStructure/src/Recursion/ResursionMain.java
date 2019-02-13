package Recursion;

public class ResursionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int n=5;        
//		int k=1;        
//		for(int i=1; i<=n; i++)        
//		{            
//			k=k*i;        
//		}        
//		System.out.println("The result is " + k);  
		
		System.out.println(NoResursion(5));
		System.out.println(withRecursion(5));
	}
	
	public static int NoResursion(int number)
	{
		if(number==0)
		{
			return 1;
		}
		
		int factorial=1;
		for(int i=1; i<=number;i++)
		{
			factorial*=i;
			//foctorial=factorial*=i;

		}
		return factorial;

	}
	
	public static int withRecursion(int number) {
		
		//recursion is when a method called by it self. it use instead of loop
		// you need to put if statement other you will get stalkoverflow error.
		// it is taking more time and memory then loop but some time is beneficial  
		
		
		if(number==0)
		{
			return 1;
		}
		
		return number*withRecursion(number-1);
	}
}
		
		