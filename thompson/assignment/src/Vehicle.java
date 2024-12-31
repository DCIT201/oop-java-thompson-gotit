public abstract class Vehicle {

    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    public Vehicle(String vehicleId,String model, double baseRentalRate){
        this.baseRentalRate = baseRentalRate;
        this.model = model;
        this.vehicleId = vehicleId;
        this.isAvailable = true;
    }

    public double getBaseRentalRate(){
        return baseRentalRate;
    }
    public void setBaseRentalRate(double baseRentalRate){
        if(baseRentalRate>0){
            this.baseRentalRate = baseRentalRate;
        }else{
            throw new IllegalArgumentException("Base rental rate must be positive");
        }
    }

    public abstract double calculateRentalCost(int days);

    public String getVehicleIdetVehicleId(){
        return vehicleId;
    }
    public void setVehicleId(String vehicleId){
        this.vehicleId = vehicleId;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
       this.model = model;
    }

    public boolean isAvailableForRent(){
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }


}
