package test1.com.Nov22;

import java.util.StringJoiner;

public class MutableStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buff=new StringBuffer();
		
		buff.append("Alex ");
		buff.append("Bob ");
		buff.append("George ");
		System.out.println(buff.capacity());
		//buff.capacity();
		System.out.println(buff.reverse());
		
		
		StringBuilder sbl =new StringBuilder("Hello World!");
		sbl.replace(2, 4, "***");
		System.out.println(sbl);
		
		StringJoiner sj=new StringJoiner(",");
		sj.add("John");
		sj.add("Wick");
		System.out.println(sj);
		
	}

}
