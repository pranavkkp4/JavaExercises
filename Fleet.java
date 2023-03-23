import java.util.*;
public class Fleet{
	public static void main(String[] args){
		ArrayList<Vehicle> cars = new ArrayList<Vehicle>();
		Scanner in = new Scanner(System.in);

		System.out.println("Enter how many cars you intend to enter ");
		int count = in.nextInt();

		while (count >0) {
			System.out.println("What type of vehicle are you entering? (1: Car, 2: Truck, 3: Motorcycle");
			int type = in.nextInt();
			if(type==1){
				Car obj = new Car();
				System.out.println("Enter make for this vehicle: ");
				String make = in.next();
				obj.setMake(make);

				System.out.println("Enter model for this vehicle: ");
				String model = in.next();
				obj.setModel(model);

				System.out.println("Enter weight for this vehicle: ");
				int weight = in.nextInt();
				obj.setWeight(weight);

				System.out.println("Enter color for this vehicle");
				String color = in.next();
				obj.setColor(color);

				System.out.println("Enter year for this vehicle ");
				int year = in.nextInt();
				obj.setYear(year);

				System.out.println("Enter MPG for this vehicle ");
				double mpg = in.nextDouble();
				obj.setMPG(mpg);

				System.out.println("Enter amount of seating ");
				int seating = in.nextInt();
				obj.setSeating(seating);
				cars.add(obj);
			}
			else if(type==2){
				Truck obj = new Truck();
				System.out.println("Enter make for this vehicle: ");
				String make = in.next();
				obj.setMake(make);

				System.out.println("Enter model for this vehicle: ");
				String model = in.next();
				obj.setModel(model);

				System.out.println("Enter weight for this vehicle: ");
				int weight = in.nextInt();
				obj.setWeight(weight);

				System.out.println("Enter color for this vehicle");
				String color = in.next();
				obj.setColor(color);

				System.out.println("Enter year for this vehicle ");
				int year = in.nextInt();
				obj.setYear(year);

				System.out.println("Enter MPG for this vehicle ");
				double mpg = in.nextDouble();
				obj.setMPG(mpg);

				System.out.println("Enter amount of seating ");
				int seating = in.nextInt();
				obj.setSeating(seating);

				System.out.println("Enter amount of hauling ");
				int hauling = in.nextInt();
				obj.setSeating(seating);
				cars.add(obj);
			}
			else if(type==3){
				Vehicle obj = new Motorcycle();
				System.out.println("Enter make for this vehicle: ");
				String make = in.next();
				obj.setMake(make);

				System.out.println("Enter model for this vehicle: ");
				String model = in.next();
				obj.setModel(model);

				System.out.println("Enter weight for this vehicle: ");
				int weight = in.nextInt();
				obj.setWeight(weight);

				System.out.println("Enter color for this vehicle");
				String color = in.next();
				obj.setColor(color);

				System.out.println("Enter year for this vehicle ");
				int year = in.nextInt();
				obj.setYear(year);

				System.out.println("Enter MPG for this vehicle ");
				double mpg = in.nextDouble();
				obj.setMPG(mpg);
				cars.add(obj);
			}
			count--;
		}
		for(Vehicle currentVehicle: cars){
			currentVehicle.stats();
		}









		/*
		This was the code from Lab Five1

		Vehicle car1 = new Vehicle(); //Using base constructor, just makes a Vehicle object for us to use and nothing else
		Scanner in = new Scanner(System.in);
		System.out.println("Enter make for car 1: ");
		String make = in.next();
		car1.setMake(make);

		System.out.println("Enter model for car 1: ");
		String model = in.next();
		car1.setModel(model);

		System.out.println("Enter weight for car 1: ");
		int weight = in.nextInt();
		car1.setWeight(weight);

		System.out.println("Enter color for car 1: ");
		String color = in.next();
		car1.setColor(color);

		System.out.println("Enter year for car 1: ");
		int year = in.nextInt();
		car1.setYear(year);

		System.out.println("Enter MPG for car 1: ");
		double mpg = in.nextDouble();
		car1.setMPG(mpg);

		
		//Lets test out data hiding logic, lets make another Vehicle object
		System.out.println("Enter make for car 2: ");
		String make2 = in.next();

		System.out.println("Enter model for car 2: ");
		String model2 = in.next();

		System.out.println("Enter weight for car 2: ");
		int weight2 = in.nextInt();

		System.out.println("Enter color for car 2: ");
		String color2 = in.next();

		System.out.println("Enter year for car 2: ");
		int year2 = in.nextInt();

		System.out.println("Enter MPG for car 2: ");
		double mpg2 = in.nextDouble();




		Vehicle car2 = new Vehicle(make2,model2,weight2,color2,mpg2,year2); //Using Overload Constructor so we can create AND define our object in 1 simpler line




		car1.stats();
		car2.stats();

		// You can see how 2 constructors work to do the same thing but in 2 different ways
		*/
		
		
		
	}
	
	
	
}