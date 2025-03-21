// Co-variant return Type

package q2;

class A {

	A obj() {
		System.out.println("Inside class A in method obj(). the return type is obj of class A");
		return this;
	}
}

class B extends A {

	@Override
	B obj() {
		System.out.println("Inside class B overriden the obj method from class B. The return type is now obj of class B");
		return this;
	}
}

public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.obj();
		B b = new B();
		b.obj();
	}

}
