package ar.com.javabrains.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringDemo {
	

	public static void main(java.lang.String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Fede", 25, "Martinez"),
				new Person("kelly", 30, "Davalos"),
				new Person("Marisa", 21, "Davalos")				
				);
		
		Collections.sort(people, new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());			
			}
		});
		
		
		printAll(people);
		
		printWithCondition(people, new Condition() {

			@Override
			public boolean test(Person p) {
				
				return p.getLastName().startsWith("D");
			}
			
		});
		
		printWithCondition(people, new Condition() {

			@Override
			public boolean test(Person p) {
				
				return p.getFirstName().startsWith("F");
			}
			
		});
	}
	

	

	private static void printWithCondition(List<Person> people, Condition condition) {
		for (Person person : people) {
			if(condition.test(person)) {
				System.out.println(person);
			}
			
		}
		
	}
	
	interface Condition{
		boolean test(Person p);
	}




	private static void printAll(List<Person> people) {
		for (Person person : people) {
			System.out.println(person);
		}
		
	}
	

	


}
