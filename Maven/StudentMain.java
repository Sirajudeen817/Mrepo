package test.com.Maven;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student("Siraj", 102, 1000);
		
		Student.College c=new Student().new College("AAA", "BLR", 1001);
		
		System.out.println(c);

	}

}
