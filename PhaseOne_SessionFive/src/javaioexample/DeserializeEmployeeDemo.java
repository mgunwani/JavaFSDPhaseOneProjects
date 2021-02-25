package javaioexample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEmployeeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee emp = null;

		FileInputStream fileIn = new FileInputStream("employee.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		emp = (Employee) in.readObject();
		System.out.println(emp);
		System.out.println("Employee Object has been deserialized successfully.");
		in.close();
		fileIn.close();

	}

}
