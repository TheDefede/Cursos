package ar.com.javabrains.lambdas;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Fede", 25, "Martinez"),
				new Person("kelly", 30, "Davalos"),
				new Person("Marisa", 21, "Davalos")				
				);
		
		/*for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		for (Person person : people) {
			System.out.println(person);
		}*/
		
		people.forEach(System.out::println);
		
		people.stream().map(System.out::println);

	}

} 
