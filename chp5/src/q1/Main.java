//Example of final Keyword


package q1;


class A {
	
	final int a = 10;
	
	void meth() {
		
//		 a = 30;   Error: variable cannot be reinitialized
	}
	
	final void meth2() {
		System.out.println("Hellow world");
	}
	
}

class B extends A {
	
//	@Override			Error:	Cannot override Final Method
//	void meth2() {
//		// TODO Auto-generated method stub
//		super.meth2();
//	}
	
}

final class C {
	String name;

}

//class D extends C {  Error : Cannot extend a final class
//	
//}



public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.meth2();
	}
}
