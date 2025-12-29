public class Driver {
    private String name;
    private String licenseNumber;

    public Driver(String name, String licenseNumber){
        this.licenseNumber = licenseNumber;
        this.name = name;
    }

    public void displayDriverInfo() {
        System.out.println("Driver: " + name + " "
        + "| license Number: " + licenseNumber);
    }
}
