package test.com.Maven;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
                 Employee e=new Employee();
                 e.setEmpId(12);
                 e.setDesg("Employee");
                 e.setEmpName("Siraj");
                 e.setMobileNum("98978687878");
                 System.out.println(e);
                 
                 //Employee e1 = new Employee("Alex",10,"Employee","816767888");
                 SavingsAccount s = new SavingsAccount("Jack", 11213242453L, "HDFC", "HDFC2435353", 10000, 5);
                 s.deposit(1000);
                 s.addInterest();
                 s.withdraw(3000);
                 System.out.println(s.getBalance());
                 
                 
                 ComplexNum c1 = new ComplexNum(3, 4);   // 3 + i4
                 ComplexNum c2 = new ComplexNum(5, 6);   // 5 + i6

                 // Create operations object
                 ComplexNum ops = new ComplexNum(0, 0);

                 // Call add method
                 ops.add(c1, c2);  // prints "8+i10"
                 
              }
    
   
}
