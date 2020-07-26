package ar.com.javabrains.lambdas;

public class ClosureExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		
		doProcess(a, i -> System.out.println(i+b));
		
	}


	public static void doProcess(int i, Processs p){
		p.processs(i);
	}

	public interface Processs{
		void processs(int i);
	}
}
