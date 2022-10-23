public class Main {
    public static void main(String[] args) {
        Car kia = new Car("Kia", "Rio", 1.6f);
        DriverB kiaDriver = new DriverB("Max", 5, kia);
        System.out.println(kiaDriver);
        kia.startMoving();
        System.out.println();
        System.out.println(kia.getMaxSpeed());

        Bus bus = new Bus("Bus", "Model", 1.8f);
        DriverD busDriver = new DriverD("Den", 9, bus);
        System.out.println(busDriver);
        bus.pitStop();

        Truck truck = new Truck("Truck", "Model", 2.4f);
        DriverC truckDriver = new DriverC("Serg", 15, truck);
        System.out.println(truckDriver);
        System.out.println(truck.getBestLapTime());

    }
}