package ar.com.javabrains.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Fede", 25, "Martinez"),
				new Person("kelly", 30, "Davalos"),
				new Person("Marisa", 21, "Davalos")				
				);
		
		
		Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
		

		
		printWithCondition(people, p -> true, System.out::println);
		
		printWithCondition(people, p-> p.getLastName().startsWith("D"), System.out::println);
		

		
		printWithCondition(people,(p)-> p.getFirstName().startsWith("F"), System.out::println);

	}
	
	

	private static void printWithCondition(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer) {
		for (Person person : people) {
			if(condition.test(person)) {
				consumer.accept(person);
			}
			
		}
		
	}
	

	
}
