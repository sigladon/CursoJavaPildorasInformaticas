package oop;

public class Van extends Car {
	
	private int extraCapacity;
	private int extraSeats;
	
	public Van(int extraCapacity, int extraSeats) {
		super();
		this.extraCapacity = extraCapacity;
		this.extraSeats = extraSeats;
	}
	
	public String getVanInfo() {
		return "The load capacity is: " + extraCapacity + " and has " + extraSeats + " extra seats";
	}
	
}
