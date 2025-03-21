package q6;
//example of composition and aggregation

class Hobbies{
	
}

class Address{
	
	String cityname;
	String statename;
	
	public Address(String cityname, String statename) {
		super();
		this.cityname = cityname;
		this.statename = statename;
	}

	@Override
	public String toString() {
		return "Address [cityname=" + cityname + ", statename=" + statename + "]";
	}
	
}

class Emp {
	
	
	int id;
	String name;
	Address address;
	Hobbies hobbies;
	
	public Emp(int id, String name, Address address, Hobbies hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + ", hobbies=" + hobbies + "]";
	}
	
	
}





public class Main {
	public static void main(String[] args) {
		Address address = new Address("Mumbai","Maharashtra");
		Emp emp = new Emp(18, "Kevil", address, null);
		System.out.println(emp);

	}
}
