package oop;


public class UsingVehicle {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.setColor("blue");
		
		Van van1 = new Van(4, 400);
		
		van1.setColor("white");
		van1.setSeats("yes");
		van1.setAc("yes");
		
		System.out.println(car1.getGeneralProperties() + " Color: " + car1.getColor() );
		System.out.println(van1.getGeneralProperties() + " " + van1.getVanInfo() );
		
	}

}
