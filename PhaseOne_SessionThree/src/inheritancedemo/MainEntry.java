package inheritancedemo;

import com.models.Result;
import com.models.Student;

public class MainEntry {

	public static void main(String[] args) {
		
		Result obj = new Result();
		obj.acceptDetails();
		obj.displayDetails();
		obj.calculateResult();
		
	System.out.println(Student.universityName);
	
	}
	
}
