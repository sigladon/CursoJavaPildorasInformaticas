package oop;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsingEmployee {

	public static void main(String[] args) {
	
		/*
		Employee employee1 = new Employee("Carlos", 85000,2004,2,4);
		Employee employee2 = new Employee("Claudio", 95000,2001,4,21);
		Employee employee3 = new Employee("Michael", 241000,2013,9,21);
		
		employee1.setIncome(5);
		employee2.setIncome(5);
		employee3.setIncome(5);
		
		System.out.println("Name: " + employee1.getName() + " Income: " + employee1.getIncome() + " Date of registration: " + employee1.getContractBegins());
		System.out.println("Name: " + employee2.getName() + " Income: " + employee2.getIncome() + " Date of registration: " + employee2.getContractBegins());
		System.out.println("Name: " + employee3.getName() + " Income: " + employee3.getIncome() + " Date of registration: " + employee3.getContractBegins());
		*/
		Boss bossHR = new Boss("Francisco", 4000,2008,12,25);
		bossHR.setExtra(400);
		
		Employee []	employees = new Employee[5];
		
		employees[0] = new Employee("Davis", 2500, 2014,5,24);
		employees[1] = new Employee("Marcelo", 2800, 2012,7,3);
		employees[2] = new Employee("Laura", 3500, 2016,9,16);
		employees[3] = bossHR;
		employees[4] = new Boss("Sofía", 4800, 2009,2,20);
		
		Boss bossTech = (Boss) employees[4];
		bossTech.setExtra(1000);
		
		Arrays.sort(employees);
		
		System.out.println(bossHR.takeDesicion("Give some vacations"));

		for (Employee i:employees) {
			i.setIncome(5);
			System.out.println("Name: " + i.getName() + " Income: " + i.getIncome() + " Date of registration: " + i.getContractBegins());
			System.out.println("Christmas Bonus: $" + i.setBonus(800));
		}
		

	}

}

class Employee implements Comparable<Object>, Workers {
	
	public Employee(String name, double income, int year, int month, int day) {
		
		this.name = name;
		this.income = income;
		
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		this.contractBegins = calendar.getTime();
		
	}
	
	public Employee(String name) {
		this(name, 1200, 2024,5,5);
	}
	
	public String getName() {
		return this.name;
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
	
	public double setBonus(double gratification) {
		return Workers.BASE_BONUES + gratification;
	}
	
	public int compareTo(Object myObject) {
		
		Employee otherEmployee = (Employee) myObject;
		
		if (this.income < otherEmployee.income)
			return -1;
		else if (this.income > otherEmployee.income)
			return 1;
		else
			return 0;
		
	}
	
	private String name;
	private double income;
	private Date contractBegins;
}

class Boss extends Employee implements Bosses {
	
	private double extra;
	
	public Boss(String name, double income, int year, int month, int day) {
		super(name, income, year, month, day);
	}
	
	public void setExtra(double b) {
		this.extra = b;
	}
	
	public double getIncome() {
		return super.getIncome() + this.extra;
	}
	
	public String takeDesicion(String decision) {

		return "A member had decided to do :" + decision; 
	}
	
	public double setBonus(double gratification) {
		double base = 2000;
		return Workers.BASE_BONUES + gratification + base;
	}
	
}
