package q3.p1;

public class A {

	
	
	private String a = "This is private";
	protected String b = "This is protected";
	public String c = "This is public";
	String d = "This is default";
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println("Insdie class A");
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
		B b = new B();
		b.displayB();
		C c = new C();
		c.displayC();
	}
}

class B {
	
	void displayB() {
		A a = new A();
		System.out.println("Inside class B");
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
	}
	
}


class C extends A{
	
	void displayC() {
		C c = new C();
		System.out.println(c.b);
		System.out.println(c.c);
		System.out.println(c.d);
		
		
	}
	
}
