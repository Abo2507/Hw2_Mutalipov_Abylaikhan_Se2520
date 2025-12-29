public class Main {
    public static void main(String[] arg){
        Driver driver1 = new Driver ("Ablay", "N001");
        Driver driver2 = new Driver ("Sayan", "F007");
        Driver driver3 = new Driver ("Assem", "F0067");

        Vehicle Car = new Car("Cobalt", 2022, 4, "petrol");
        Vehicle Truck = new Truck("Nissan", 2024, 6, 1.5);
        Vehicle Motorcycle = new Motorcycle("Harley-Davidson", 2020, false);

        Car.setDriver(driver1);
        Motorcycle.setDriver(driver2);
        Truck.setDriver(driver3);

        Vehicle[] vehicles = {Car, Motorcycle, Truck};

        for (Vehicle v : vehicles){
            System.out.println(" ");
            v.startEngine();
            v.displayInfo();
            v.stopEngine();
        }

    }
}