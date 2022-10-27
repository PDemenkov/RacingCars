import java.time.chrono.ThaiBuddhistChronology;
import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing {
    private BusСapacity busСapacity;

    public Bus(String brand, String model, float engineVolume, BusСapacity busСapacity) {
        super(brand, model, engineVolume);
        this.busСapacity = busСapacity;
    }

    @Override
    public void startMoving() {
        System.out.printf("Bus %s %s Start moving", this.getBrand(), this.getModel());
    }

    @Override
    public void endMoving() {
        System.out.printf("Bus %s %s End moving", this.getBrand(), this.getModel());
    }

    @Override
    public void printType() {
        if (this.busСapacity != null) {
            System.out.println(this.busСapacity);
        } else {
            System.out.println("Информации недостаточно");
        }
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не нуждается");
    }


    @Override
    public void pitStop() {
        System.out.printf("Bus %s %s in pit-stop", this.getBrand(), this.getModel());
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(90, 150);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(100, 180);
    }

}
