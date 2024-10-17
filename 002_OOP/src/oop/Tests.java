package oop;

public class Tests {

	public static void main(String[] args) {
		
		Employees worker1 = new Employees("Paco");
		Employees worker2 = new Employees("Ana");
		Employees worker3 = new Employees("Antonio");
		Employees worker4 = new Employees("María");
		
		worker1.setSection("RRHH");
		
		System.out.println(worker1.getData());
		System.out.println(worker2.getData());
		System.out.println(worker3.getData());
		System.out.println(worker4.getData());

		System.out.println(Employees.getNextId());

	}

}

class Employees {
	
	private final String name;
	private String section;
	private int id;
	private static int nextId = 1;
	
	public Employees(String name) {
		this.name = name;
		section = "Administration";
		this.id = nextId;
		nextId++;
	}
	
	public void setSection(String section) {
		this.section = section;
	}
	
	public String getData() {
		return "Name: " + name + ". Section: " + section + ". Id: " + id + ".";
	}
	
	public static String getNextId() {
		return "Next ID: " + nextId;
	}
		
	
}
