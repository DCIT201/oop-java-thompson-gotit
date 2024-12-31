public class Car extends Vehicle implements Irentable{
    private int numberOfDoors;
    private boolean isluxurious;

    public Car(String vehicleId, String model, double baseRentalRate, int numberOfDoors, boolean isluxurious){
        super(vehicleId, model, baseRentalRate);
        this.numberOfDoors = numberOfDoors;
        this.isluxurious = isluxurious;
    }
    @Override
    public double calculateRentalCost(int days) {
        double rentalCost = getBaseRentalRate() * days;
        if(isluxurious){
            rentalCost+= 50.0*days;
        }
        System.out.println(rentalCost);
        return rentalCost;
    }
    @Override
    public void rent(Customer customer, int days){
        if(isAvailableForRent()){
            System.out.println("This car is rented to "+ customer.getName());
            setAvailable(false);
        }else{
            System.out.println("This car is not available for rent.");
        }
    }
    @Override
   public void returnVehicle(){
        System.out.println("This car is returned");
        setAvailable(true);
    }
}

