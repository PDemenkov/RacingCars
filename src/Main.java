import java.sql.Driver;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car kia = new Car("Kia", "Rio", 1.6f, TypeOfBody.TYPE_COUPE);
        DriverB kiaDriver = new DriverB("Max", 5, kia);
        Mechanic<Car> kiaMechanic = new Mechanic<>("Oleg", "Krotov", "Mercedes");
        Sponsor tinkoff = new Sponsor("Tinkoff", 20000);
        Sponsor gazProm = new Sponsor("Gazprom", 40000);
        kia.addDriver(kiaDriver);
        kia.addMechanic(kiaMechanic);
        kia.addSponsor(tinkoff,gazProm);

        Bus bus = new Bus("Bus", "Model", 1.8f, BusСapacity.BIG);
        DriverD busDriver = new DriverD("Den", 9, bus);
        Mechanic<Bus> busMechanic = new Mechanic<>("Vova", "Fam", "RedBull");
        bus.addDriver(busDriver);
        bus.addMechanic(busMechanic);
        bus.addSponsor(tinkoff);

        Truck truck = new Truck("Truck", "Model", 2.4f, Weight.N3);
        DriverC truckDriver = new DriverC("Serg", 15, truck);
        Mechanic<Truck> truckMechanic = new Mechanic<>("Valera", "Glt", "McLaren");
        truck.addDriver(truckDriver);
        truck.addMechanic(truckMechanic);
        truck.addSponsor(gazProm);


        List<Transport> transports = List.of(kia, bus, truck);





//        try {
//            kia.passDiagnostics();
//        } catch (DiagnosticsException e) {
//            System.out.println("Транспортное средство не прошло диагностику " + e.getMessage());
//            kia.repair();
//        } try {
//            bus.passDiagnostics();
//        } catch (DiagnosticsException e) {
//            System.out.println("Транспортное средство не прошло диагностику " + e.getMessage());
//            bus.repair();
//        } try {
//            truck.passDiagnostics();
//        } catch (DiagnosticsException e) {
//            System.out.println("Транспортное средство не прошло диагностику " + e.getMessage());
//            truck.repair();
//        }
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(kia);
        serviceStation.addTruck(truck);
        serviceStation.service();
        serviceStation.service();

        for (Transport transport : transports) {
            printInfo(transport);
        }

    }

    public static void printInfo(Transport transport) {
        System.out.println("Информация об автомобиле" + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители: " + transport.getDrivers());
        System.out.println("Спонсоры: " + transport.getSponsors());
//        for (Sponsor sponsor : transport.getSponsors()) {
//            System.out.println(sponsor.getName());
//        }
        System.out.println("Механики: " + transport.getMechanics());
//        for (Mechanic mechanic : transport.getMechanics()) {
//            System.out.println(mechanic.getName() + " " + mechanic.getSurName() +" " + mechanic.getCompany());
//        }
    }

}