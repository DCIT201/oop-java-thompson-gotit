public class Truck extends Vehicle implements Irentable{
    private int payloadCapicity;

    public Truck(String vehicleId, String model, double baseRentalRate, int payloadCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.payloadCapicity = payloadCapacity;
    }
    @Override
    public double calculateRentalCost(int days) {
        double rentalCost = getBaseRentalRate();
        if (payloadCapicity>2500){
            rentalCost += 100*days;
        }
        System.out.println(rentalCost);
        return rentalCost;
    }

    @Override
    public void rent(Customer customer, int days){
        if (isAvailableForRent()) {
            System.out.println("This truck is rented to " + customer.getName());
            setAvailable(false);
        }else{
            System.out.println("This truck is not available for rent");
        }
    }
    @Override
    public void returnVehicle(){
        System.out.println("This truck is returned");
    }


}
