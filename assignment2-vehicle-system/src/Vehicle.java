public abstract class Vehicle {
     private String brand;
     private int year;
     protected Driver driver;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand(){
         return brand;
     }
     public int getYear(){
         return year;
     }

     public void setDriver(Driver driver) {
         this.driver = driver;
     }
     public abstract void startEngine();
     public abstract void stopEngine();

     public void displayInfo() {
         System.out.println("Brand:" + brand + " " + "| Year:"
         + year );
         if (driver != null) {
             driver.displayDriverInfo();
         }
         else {
             System.out.println("No driver data");
         }
     }

}
