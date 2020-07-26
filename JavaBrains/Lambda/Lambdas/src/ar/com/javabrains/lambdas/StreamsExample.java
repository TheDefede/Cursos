package ar.com.javabrains.lambdas;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Fede", 25, "Martinez"),
				new Person("kelly", 30, "Davalos"),
				new Person("Marisa", 21, "Davalos")				
				);
		
		people.stream()
		.filter(p->p.getLastName().startsWith("D"))
		.forEach(p->System.out.println(p.getLastName()));
		
		Long count = people.parallelStream()
		.filter(p->p.getLastName().startsWith("D"))
		.count();
		
		System.out.println(count);
	}

}
