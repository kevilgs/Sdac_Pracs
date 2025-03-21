// Implementation of finalize method

package q2;

class Emp {

	String name;

	public Emp(String name) {
		super();
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is being deleted");
	}

}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp("Kevil");
		emp = null;
		System.gc();
		System.out.println(emp);
	}
}
