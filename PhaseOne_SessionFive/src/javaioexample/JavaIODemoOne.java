package javaioexample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author BhawnaGunwani
 *
 *	Create New File in Java:
 *	1. File.createNewFile() Method
 *	2. FileOutputStream
 *	3. java.nio.file.Files (File API)
 *
 */

public class JavaIODemoOne {

	public static void main(String[] args) throws IOException {
		
		/**
		 * Create New File using File.createNewFile() Method
		 */
		
		/*
		File file = new File("d:/file1.txt");
		boolean status = file.createNewFile();
		if(status)
			System.out.println("File has been created successfully.");
		else
			System.out.println("File Already present at specific Location.");
		*/
		
		/**
		 * Create New File using FileOutputStream
		 */
		
		/*
		String str = "Hello World!!";
		FileOutputStream fout = new FileOutputStream("d:/file2.txt");
		fout.write(str.getBytes());
		System.out.println("Written to File Successfully.");
		fout.close();
		*/
		
		/**
		 * Create New File using java.nio.io.File
		 */
		
		List<String> lines = Arrays.asList("Line1", "Line2");
		Files.write(Paths.get("d:/file3.txt"), lines, StandardCharsets.UTF_8,
				StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		System.out.println("File has been written successfully.");
		
	}
}
