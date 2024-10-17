package oop;

public class Car {

	private int tires;
	private int length;
	private int width;
	private int engine;
	private int platformWeight;
	
	private String color;
	private int finalWeight;
	private boolean leatherSeats, ac;

	public Car() {

		tires = 4;
		length = 2000;
		width = 300;
		engine = 1600;
		platformWeight = 500;

	}
	
	public String getGeneralProperties() {
		return "The car platform has " + tires + " tires."
				+ "It's " + length + " m length, " + width + " m width."
				+ "Its platform weights " + platformWeight + " kgs." 
				+ "Its engine is " + engine + " cc.";
	}
	
	public void setColor(String carColor) {
		color = carColor;
	}
	
	public String getColor() {
		return "This car is " + color;
	}
	
	public void setSeats(String leatherSeats) {
		if (leatherSeats.equalsIgnoreCase("yes")) {
			this.leatherSeats = true;
		} else {
			this.leatherSeats = false;
		}
	}
	
	public String getLeatherSeats() {
		if (leatherSeats) {
			return "The car has leather seats.";
		} else {
			return "The car has normal seats";
		}
	}
	
	public void setAc(String ac) {
		if (ac.equalsIgnoreCase("yes")) {
			this.ac = true;
		} else {
			this.ac = false;
		}
	}

	public String getAc() {
		if (ac) {
			return "The car has AC";
		} else {
			return "The car doesn't have AC";
		}
	}
	
	public String getCarWeight() {
		int structureWeight = 500;
		finalWeight = platformWeight + structureWeight;
		if (leatherSeats) {
			finalWeight += 50;
		}  
		if (ac) {
			finalWeight += 20;
		}
		return "The car weights " + finalWeight;
	}
	
	public int carPrice() {
		int finalPrice = 10000;
		
		if (leatherSeats) {
			finalPrice += 2000;
		}  
		if (ac) {
			finalPrice += 1500;
		}
		return finalPrice;
		
	}
}
