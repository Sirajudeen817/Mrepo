package com.demo.IoStream.Nov28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoOnIOStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
          //character strteam example
//		BufferedReader reader=new BufferedReader(new FileReader("assests/data.txt"));
//		String data;
//		while((data=reader.readLine())!=null )
//			System.out.println(data);
//		
//		BufferedWriter writer=new BufferedWriter(new FileWriter("assests/data.txt",true));
//		writer.write(" This is new data");
//		writer.close();
		
//		while((data=reader.readLine())!=null )
////			System.out.println(data);
///
///
///     byte output stream
//		FileOutputStream fos=new FileOutputStream("assests/info.txt");
//		String text="Hello";
//		fos.write(text.getBytes());
//		fos.close();
//		
		//FileInputStream fis=new FileInputStream("assests/info.txt");
//		int b;
//		while((b=fis.read())!=-1)
//			System.out.print((char)b);
//		fis.close();
		
//		byte arr[]=new byte[(int) new File("assests/info.txt").length()];
//		fis.read(arr);
//		fis.close();
//		System.out.println(new String(arr));
//		
		
		//Object Stream Example
//		
//		Bottle b=new Bottle(1,"Tupperware",1000,"red");
//		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("assests/bottleInfo.txt"));
//		oos.writeObject(b);
//		oos.close();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("assests/bottleInfo.txt"));
		
		Bottle b1=(Bottle)ois.readObject();
		ois.close();
		System.out.println(b1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
