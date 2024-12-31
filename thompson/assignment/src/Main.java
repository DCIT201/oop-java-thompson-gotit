public class Main {

    public static void main(String [] args){
    Car myCar = new Car("22099559","Urus",200.0, 5,true);
    Customer osman = new Customer("101466","Osman");
        myCar.rent(osman,25);
        myCar.calculateRentalCost(25);
            }
}
