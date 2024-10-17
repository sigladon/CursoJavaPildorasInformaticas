package oop;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsingPerson {

	public static void main(String[] args) {
		
		Person [] people = new Person[2];
		
		people[0] = new Employee2("Juan", 2500,2012,5,23);
		people[1] = new Student("Paola", "Computer Science");
		
		
		for (Person e:people) {
			System.out.println(e.getName() + " ," + e.getDescription());
		}

	}
}

abstract class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract String getDescription();
	
}

class Employee2 extends Person {

	private double income;
	private Date contractBegins;
	private int id;
	private static int nextId = 1;
	
	public Employee2(String name, double income, int year, int month, int day) {

		super(name);
		this.income = income;
		
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		this.contractBegins = calendar.getTime();
		this.id = nextId;
		nextId++;
		
	}
	
	public double getIncome() {
		return this.income;
	}
	
	public Date getContractBegins() {
		return this.contractBegins;
	}
	
	public void setIncome(double percentage) {
		double raise = income * percentage/100;
		this.income += raise;
	}
	
	public String getDescription() {
		return "This employee has an ID: " + id + " with a salary of " + income;
	}
	
}

class Student extends Person {
	
	private String degree;
	
	public Student(String name, String degree) {
		super(name);
		this.degree = degree;
	}
	
	public String getDegree() {
		return degree;
	}
	
	public String getDescription() {
		return "This student is studying " + degree;
	}
}
