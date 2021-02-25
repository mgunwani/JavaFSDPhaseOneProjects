package exceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 
 * @author BhawnaGunwani
 *
 *	Checked Exception
 */

public class ExceptionDemoTwo {

	public static void main(String[] args) throws IOException {
		
//		try {
//			FileInputStream fs = new FileInputStream("d:/test.txt");
//			int charRead = 0;
//			while((charRead = fs.read()) != -1){
//				System.out.println((char)charRead);
//			}
//			fs.close();	
//		} catch(IOException ex) {
//			System.out.println(ex.getMessage());
//		}
		
		FileInputStream fs = new FileInputStream("d:/test.txt");
		int charRead = 0;
		while((charRead = fs.read()) != -1){
			System.out.println((char)charRead);
		}
		fs.close();	
		
	}
	
}
