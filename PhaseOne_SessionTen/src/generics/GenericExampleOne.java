package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*import java.util.ArrayList;
import java.util.List;*/

class MyClass<T> {
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}

interface MyInterface<T1, T2> {
	T1 funcOne(T1 val1, T1 val2);
	T2 funcTwo(T2 val1, T2 val2);
}

class CalcOne implements MyInterface<Integer, Float> {
	@Override
	public Integer funcOne(Integer val1, Integer val2) {
		return val1 + val2;
	}

	@Override
	public Float funcTwo(Float val1, Float val2) {
		return val1 + val2;
	}
}

class CalcTwo implements MyInterface<Float, Float> {

	@Override
	public Float funcOne(Float val1, Float val2) {
		return val1 + val2;
	}

	@Override
	public Float funcTwo(Float val1, Float val2) {
		return val1 + val2;
	}

	
}


public class GenericExampleOne {
	
	public static<T> int countAllOccurances(T[] list, T item) {
		int count = 0;
		
		if(item == null) {
			for (T t : list) {
				if(t == null)
					count++;
			}
		}
		else {
			for (T t : list) {
				if(item.equals(t))
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		// Generic Type Methods or Constructors
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(100);
		list.add(200);
		list.add(100);
		list.add(null);
		list.add(null);
		
		// System.out.println(countAllOccurances(Integer<list>, Integer<100>));
		// System.out.println(countAllOccurances(list<Integer>, 100<Integer>));
		
		// Generic:
		// List<Integer> list = new ArrayList<Integer>();
		// List<Employee> emplist = new ArrayList<Employee>();
	
		// Generic Types:
		// Generic Type Class or Interface
		
		/*
		 * MyClass<String> obj = new MyClass<String>(); obj.setT("Bhawna");
		 * System.out.println(obj.getT());
		 * 
		 * CalcOne obj1 = new CalcOne(); System.out.println(obj1.funcOne(100, 200));
		 * System.out.println(obj1.funcTwo(12.5F, 10.4F));
		 * 
		 * CalcTwo obj2 = new CalcTwo(); System.out.println(obj2.funcOne(100.4F,
		 * 200.6F));
		 */		

		
		// Generic Array
		
		// Generic WildCards
	}
}
