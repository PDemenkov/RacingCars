import java.sql.Driver;
import java.time.chrono.ThaiBuddhistChronology;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car kia = new Car("Kia", "Rio", 1.6f, TypeOfBody.TYPE_COUPE);
        DriverB kiaDriver = new DriverB("Max", 5, kia);
        System.out.println(kiaDriver);
        kia.printType();
        kia.startMoving();
        System.out.println();
        System.out.println(kia.getMaxSpeed());

        Bus bus = new Bus("Bus", "Model", 1.8f, BusСapacity.BIG);
        DriverD busDriver = new DriverD("Den", 9, bus);
        System.out.println(busDriver);
        bus.printType();
        bus.pitStop();
        System.out.println();
        System.out.println(Arrays.toString(BusСapacity.values()));
        System.out.println();

        Truck truck = new Truck("Truck", "Model", 2.4f, Weight.N3);
        DriverC truckDriver = new DriverC("Serg", 15, truck);
        truck.printType();
        System.out.println(truckDriver);
        System.out.println(truck.getBestLapTime());
        
        service(kia,bus,truck);
    }
    private static void service(Transport... transports) {
        for (Transport transport : transports) {

            serviceTransport(transport);
            }
        }
    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.service()) {
                throw new RuntimeException("Автомобиль" + transport.getBrand() + transport.getModel() + " не прошел диагностику");
            }
            } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}