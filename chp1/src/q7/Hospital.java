package q7;

interface HospitalOperations {
	void register();

	void generateReport();

	void updateRecord();

	void checkStatus();

	void processPayment();
}

abstract class Person {
	protected String id;
	protected String name;
	protected int age;
	protected String contactNumber;
	protected String address;

	public Person(String id, String name, int age, String contactNumber, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.contactNumber = contactNumber;
		this.address = address;
	}

	public abstract void displayDetails();
}

class Patient extends Person implements HospitalOperations {

	private String diagnosis;

	public Patient(String id, String name, int age, String contactNumber, String address, String medicalHistory,
			String insuranceDetails) {
		super(id, name, age, contactNumber, address);
		this.diagnosis = "Under observation";
	}

	@Override
	public void displayDetails() {
		System.out.println("Patient: " + name + " (ID: " + id + ")");
	}

	@Override
	public void register() {
		System.out.println("Patient registered");
	}

	@Override
	public void generateReport() {
		System.out.println("Patient medical report generated");
	}

	@Override
	public void updateRecord() {
		System.out.println("Patient record updated");
	}

	@Override
	public void checkStatus() {
		System.out.println("Patient status: " + diagnosis);
	}

	@Override
	public void processPayment() {
		System.out.println("Patient payment processed");
	}
}

//Doctor class
class Doctor extends Person implements HospitalOperations {
	private String specialization;

	public Doctor(String id, String name, int age, String contactNumber, String address, String specialization,
			String department, String licenseNumber) {
		super(id, name, age, contactNumber, address);
		this.specialization = specialization;
	}

	@Override
	public void displayDetails() {
		System.out.println("Doctor: " + name + " (ID: " + id + ", Specialization: " + specialization + ")");
	}

	@Override
	public void register() {
		System.out.println("Doctor registered");
	}

	@Override
	public void generateReport() {
		System.out.println("Doctor performance report generated");
	}

	@Override
	public void updateRecord() {
		System.out.println("Doctor record updated");
	}

	@Override
	public void checkStatus() {
		System.out.println("Doctor status: Active");
	}

	@Override
	public void processPayment() {
		System.out.println("Doctor salary processed");
	}

	// Doctor-specific operation
	public void prescribeMedicine(Patient patient, String medicine) {
		System.out.println("Medicine prescribed to patient: " + medicine);
	}
}

public class Hospital {
	public static void main(String[] args) {

		Patient patient = new Patient("P001", "Mary", 35, "12234567890", "Borivali", "None", "Insurance-123");

		Doctor doctor = new Doctor("D001", "Dr. Smith", 45, "9999999999", "Kandivali", "Cardiology", "Cardiac Care",
				"L12345");

		System.out.println("\n--- Patient Operations ---");
		patient.displayDetails();
		patient.register();
		patient.generateReport();
		patient.updateRecord();
		patient.checkStatus();
		patient.processPayment();

		System.out.println("\n--- Doctor Operations ---");
		doctor.displayDetails();
		doctor.register();
		doctor.generateReport();
		doctor.updateRecord();
		doctor.checkStatus();
		doctor.processPayment();

		System.out.println("\n--- Doctor-Patient Interaction ---");
		doctor.prescribeMedicine(patient, "Aspirin");
	}
}
