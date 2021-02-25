package javaioexample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 
 * @author BhawnaGunwani
 *
 *	Serialization of Employee Object
 */

public class SerializeEmployeeDemo {

	public static void main(String[] args) throws IOException {
	
		/*
		Employee emp = new Employee();
		FileOutputStream fileOut = new FileOutputStream("employee.ser");
		ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
		outStream.writeObject(emp);
		outStream.close();
		fileOut.close();
		System.out.println("Employee Object is serialized successfully.");
		*/
		
		Address address = new Address("12", "Bangalore", "India");
		Employee employee = new Employee(101, "King Kochhar", "Sales", address);
		
		FileOutputStream fileOut = new FileOutputStream("employee.ser");
		ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
		outStream.writeObject(employee);
		outStream.close();
		fileOut.close();
		System.out.println("Employee Object is serialized successfully.");
		
	}
	
}
