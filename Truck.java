public class Truck extends Vehicle {
    private int seating;
    private int hauling;

    public void setSeating(int in) {

        seating = in;
    }

    public int getSeating() {

        return seating;
    }

    public void setHauling(int in) {

        hauling = in;
    }

    public int getHauling() {

        return hauling;
    }

    // The parent class also has an identically named method, this method used in
    // this subclass will OVERRIDE its parents stats() method when called from an
    // object of this subclass.
    // This is polymorphism(many shapes)
    public void stats() {
        System.out.println("Vehicle make " + this.getMake());
        System.out.println("Vehicle model name: " + this.getModel());
        System.out.println("Vehicle model year: " + this.getYear());
        System.out.println("Vehicle weight is: " + this.getWeight());
        System.out.println("Vehicle color is: " + this.getColor());
        System.out.println("Vehicle EPA rated MPG: " + this.getMPG());
        System.out.println("Vehicle seating capacity: " + seating); // extra line of output to show the extra datafield
        System.out.println("Vehicle hauling is " + hauling);
    }
}
