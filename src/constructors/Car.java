package constructors;

public class Car {
	
	String company;
	String model;
	double price;
	double milage;
	String color;
	
	public Car(String c,String m,double p,double mi,String co) {
		
		company = c;
		model = m;
		price = p;
		milage = mi;
		color = co;
		
	}
	
	public void startCar() {
		
		System.out.println("Car from "+company+" having model "+model+" has started.");
		
	}
	
	public void stopCar() {
		
		System.out.println("Car from "+company+" having model "+model+" has stopped.");
		
	}
	
	public void carDetails() {
		
		System.out.println("Company of the car is: "+company);
		System.out.println("Model of the car is: "+model);
		System.out.println("Price of the car is: "+price);
		System.out.println("Milage of the car is: "+milage);
		System.out.println("Color of the car is: "+color);
		System.out.println("---------------------");
	}
	
}
