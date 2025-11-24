package test1.com.Nov22;

import java.io.File;
import java.io.FileNotFoundException;

public class FileException {

	public static void useFile(File f)throws FileNotFoundException{
		if(!f.exists())
			throw new FileNotFoundException();
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f=new  File("demo.txt");
		
		useFile(f);

	}

}
