package test1.com.Nov22;

public class Throw {

	
	 public static void check(int a,int b[])
	   {
		   for(int i=0;i<b.length;i++)
		   {
			   if(b[i]==0)
			   {
				   throw new ArithmeticException();
			   }
			   else
			   {
				   System.out.println(a/b[i]);
			   }
		   }
			 
	   }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50,b []={2,3,4,0};
		
		check(a,b);
		System.out.println("Application completed");
		}

	
	  
}
