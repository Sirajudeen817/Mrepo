package test1.com.Nov22;

public class DemoonExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5,b []= {1,2,3,4,5};
		String str =null;
		
		
		
		
		try
		{
			System.out.println(str.charAt(0));
		}
		
		catch(NullPointerException ne)
		{
		ne.printStackTrace();
	    } 
		catch(ArrayIndexOutOfBoundsException ai)
		{
			ai.printStackTrace();
		}
		catch(RuntimeException re)
		{
			re.printStackTrace();
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Successful");

	}

}

