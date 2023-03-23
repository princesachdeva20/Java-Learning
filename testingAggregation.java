class Vehicle {

    // Complete this implementation
    public int id;
    public String model;

    public Vehicle(int id, String model){
        this.id = id;
        this.model = model;
    }
}

class Driver {

    // Complete this implementation
    private String driverName;
    private Vehicle vehicle;
    public Driver(String _driverName, Vehicle _vehicle){
        this.driverName = _driverName;
        this.vehicle = _vehicle;
    }
    public void printdetails(){
        System.out.println("The name of the Driver is "+ this.driverName+" is Driving "+ vehicle.model);
    }
}

class testingAggregation {

    public static void main(String args[]) {
        // Write your code here
        Vehicle testvehicle = new Vehicle(4453 , "Volvo S60");{
            Driver firstDriver = new Driver("John",testvehicle);
            firstDriver.printdetails();
        }
    }

}