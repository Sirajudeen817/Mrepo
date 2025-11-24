package test1.com.Nov22;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits fruitsArr[] =new Fruits[5];
		Fruits fruit1=new Fruits("apple","Red",60.00);
		Fruits fruit2=new Fruits("Banana","Yellow",40.00);
		Fruits fruit3=new Fruits("Mosambi","Green",100.00);
		Fruits fruit4=new Fruits("Passion","Gold",160.00);
		
		fruitsArr[0]=fruit1;
	    fruitsArr[1]=fruit2;
	    fruitsArr[2]=fruit3;	
	    fruitsArr[3]=fruit4;	
	    
	    for(int i=0;i<fruitsArr.length;i++)
	    {
	    	System.out.println("Cost per dozen for "+fruitsArr[i].getFruitName()+" is "+fruitsArr[i].calculateCostPerDozen());
	    }

	}
	
	
}
