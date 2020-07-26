package ar.com.javabrains.lambdas;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		
		Thread l = new Thread(MethodReferenceExample1::printMessage); //method reference
		
		printMessage();

	}
	
	public static void printMessage() {
		System.out.println("Hello world");
	}

}
