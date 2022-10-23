public class Main {
    public static void main(String[] args) {
        Car car = new Car("Kia", "Rio", 1.6f);
        DriverB driverB = new DriverB("Max", 5, car);
        System.out.println(driverB);
    }
}