package ar.com.javabrains.lambdas;

public class Person{
	
	private String firstName;
	private int edad;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Person(String firstName, int edad, String lastName) {
		super();
		this.firstName = firstName;
		this.edad = edad;
		this.lastName = lastName;
	}

	
	

}