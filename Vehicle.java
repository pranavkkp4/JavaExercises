public class Vehicle {
	//these variables are part of the public class itself but are PRIVATE meaning they cant be directly seen or accessed by a program making a Vehicle object, they are using "data hiding"
	// to access or set these we will need to make an INTERFACE to the class, ie public methods to get and set them - java calls this practice "getters and setters"
	private String make = "";
	private String model = "";
	private int weight = 0;
	private String color = "";
	private double mpg = 0.0;
	private int year = 0000;
	private String notes = "System notes: \n";
	//Constructor allow us to create an OBJECT instance of our class in various ways
	
	//This is our base constructor, it will just allow an object to be created with a 'new Vehicle()' command. To set the datafields we will need to call the methods ourself.
	public Vehicle(){
	}
	// This is also a constructor of the same name but declared differently with an ability to take in parameters. This is 'Constructor Overloading'
	public Vehicle(String inmake,String inmodel,int inweight,String incolor,double inmpg,int inyear){
		//This constructor can take in all the needed info for a car to be defined in the line declaring the object. It will call the setters.
		// we could access the data fields above directly 'mpg = inmpg;' for example, but we would like to still apply our datahiding rules
		setModel(inmake);
		setModel(inmodel);
		setWeight(inweight);
		setColor(incolor);
		setMPG(inmpg);
		setYear(inyear);
	}

	//make setter
	public void setMake(String in){
		make = in.toUpperCase();
	}
	public  void setModel(String in){
		//setter methods usually are VOID datatype as they only act to take in a value without giving anything back
		// what if I need to make sure model names are stored as uppercase only? If I make the data fields public I cant enforce a rule like that. By hiding the data and using an interface i can
		model = in.toUpperCase();
	}
	//make getter
	public String getMake(){
		return make;
	}
	public  String getModel(){
		//getters datatype for the method needs to match the datatype of the field it will return
		//notice it isnt taking IN any parameters? It doesnt need to for this case
		return model;
		
	}
	
	public  void setWeight(int in){
		// enforce a rule that a weight below 1000 is invalid and notify through the 'notes' field above the weight entered was invalid
		if (in < 1000)
		{
			notes += "The user entered an invalid weight of " + in + " as a weight \n";
		}
		weight = in;
		
		
	}
	public  int getWeight(){
		return weight;
	}
	public  void setColor(String in){
		color = in;
	}
	public  String getColor(){
		return color;
	}
	
	public  void setYear(int in){
		//make sure year isnt prior to 1930 or notify in notes an invalid year was entered
		if (in < 1930)
		{
			notes += "The user entered an invalid year of " + in +  " for vehicle model year\n";
		}
		year = in;
		
	}
	public  int getYear(){
		return year;
	}
	public  void setMPG(double in){
		mpg = in;
	}
	public  double getMPG(){
		return mpg;
	}
	
	
	public void stats(){
		System.out.println("Vehicle model name: " + model);
		System.out.println("Vehicle model year: " + year);
		System.out.println("Vehicle weight is: " + weight);
		System.out.println("Vehicle color is: " + color);
		System.out.println("Vehicle EPA rated MPG: " + mpg);
		System.out.println(notes);
	}
	
	
	
	
	
	
}