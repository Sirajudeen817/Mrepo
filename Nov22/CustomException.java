package test1.com.Nov22;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("Siraj",111,17);
		try {
			p.checkEligibility();
		}
		catch (AgeNotSufficientException e){
			e.printStackTrace();
		}
        System.out.println();
	}

}
