public class Motorcycle extends Vehicle implements Irentable{
    int engineCapacity;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, int engineCapacity){
        super(vehicleId, model, baseRentalRate);
        this.engineCapacity = engineCapacity;
    }
    @Override
    public double calculateRentalCost(int days) {
        double rentalCost = getBaseRentalRate() * days;
        if(engineCapacity>600){
            rentalCost += 50*days;
        }
        System.out.println(rentalCost);
        return rentalCost;
    }

    @Override
    public void rent(Customer customer, int days){
        if(isAvailableForRent()){
            System.out.println("This motorcycle is rented to "+ customer.getName());
            setAvailable(false);
        }else{
            System.out.println("This motorcycle is not Available for rent.");
        }
    }

    @Override
    public void returnVehicle(){
        System.out.println("This motocycle is returned.");
    }
}

