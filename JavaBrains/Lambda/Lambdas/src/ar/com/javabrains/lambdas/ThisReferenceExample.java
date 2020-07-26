package ar.com.javabrains.lambdas;

import ar.com.javabrains.lambdas.ClosureExample.Processs;

public class ThisReferenceExample {
	
	public void doProcess(int i, Processs p) {
		p.processs(i);
	}
	
	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value of i is " + i);
			System.out.println(this);
		});
	}
	
	public static void main(String[] args) {
		
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		
		thisReferenceExample.doProcess(10, (i -> {
			System.out.println("Value of i is " + i);
			//System.out.println(this); this will now work
			
		}));
		
		thisReferenceExample.execute();
		
		
	}

}
