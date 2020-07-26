package ar.com.javabrains.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import ar.com.javabrains.lambdas.StringDemo.Condition;

public class StringDemoJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Fede", 25, "Martinez"),
				new Person("kelly", 30, "Davalos"),
				new Person("Marisa", 21, "Davalos")				
				);
		
		
		Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
		
		/*new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());			
			}
		}*/
		
		
		printAll(people);
		
		printWithCondition(people, (p)-> p.getLastName().startsWith("D"));
		
		/*new Condition() {

			@Override
			public boolean test(Person p) {
				
				return p.getLastName().startsWith("D");
			}
			
		}*/
		
		printWithCondition(people,(p)-> p.getFirstName().startsWith("F"));
		
		/* new Condition() {

				@Override
				public boolean test(Person p) {
					
					return p.getFirstName().startsWith("F");
				}
				
			}*/

	}
	
	

	private static void printWithCondition(List<Person> people, Condition condition) {
		for (Person person : people) {
			if(condition.test(person)) {
				System.out.println(person);
			}
			
		}
		
	}
	

	private static void printAll(List<Person> people) {
		for (Person person : people) {
			System.out.println(person);
		}
		
	}
	


}
