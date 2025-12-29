public class Truck extends Vehicle{
    private double capasity;
    private int numAxles ;

    public Truck(String brand, int year, int numaxles, double capasity){
        super(brand, year);
        this.capasity = capasity;
        this.numAxles = numaxles;
    }
    @Override
    public void startEngine() {
        System.out.println("Truck engine started");
    }
    @Override
    public void stopEngine() {
        System.out.println("Truck engine stopped");
    }
}
