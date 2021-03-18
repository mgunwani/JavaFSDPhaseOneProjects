package streams_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamsDemoOne {

	public static void main(String[] args) {
		
		
		/*
		 * int[] numbers = {1,2,3,4,5,6,7,8,9,10}; 
		 * for (int i = 0; i < numbers.length; i++) { System.out.println(numbers[i]); }
		 * for (int number : numbers) { System.out.println(number); }
		 */
		
		// Stream<Integer> intStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
		// intStream.forEach(num -> System.out.println(num) );

		// Stream<Integer> intStream = Stream.of(new Integer[] {1,2,3,4,5,6,7,8,9,10});
		// intStream.forEach(num -> System.out.println(num) );
		
		/*
		 * List<Integer> list = new ArrayList<Integer>(); for (int i = 0; i < 10; i++)
		 * list.add(i); Stream<Integer> listStream = list.stream();
		 * listStream.forEach(num -> System.out.println(num) );
		 */
		
		/*
		 * Stream<Integer> randomNumbers = Stream.generate(() -> (new
		 * Random().nextInt(200)));
		 * randomNumbers.limit(10).forEach(System.out::println);
		 */
		
		
		  List<Integer> list = new ArrayList<Integer>(); 
		  for (int i = 0; i < 10; i++)
			  list.add(i); 
		  
		  
		  Stream<Integer> listStream = list.stream();
		  List<Integer> evenNumbersList = listStream.filter(num -> num%2 == 0)
				  .collect(Collectors.toList());
		  //System.out.println(evenNumbersList);
		  //evenNumbersList.forEach(System.out::println);
		  evenNumbersList.forEach(num -> System.out.println(num));
		
		  Stream<Integer> listStream1 = list.stream();
		  Integer[] evenNumbersArray = listStream1.filter(num -> num%2 == 0)
				  .toArray(Integer[]::new);
		  System.out.println(evenNumbersArray.toString());
		  
	}
}
