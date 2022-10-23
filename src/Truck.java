import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing{
    public Truck(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.printf("Truck %s %s Star moving",this.getBrand(),this.getModel());
    }

    @Override
    public void endMoving() {
        System.out.printf("Truck %s %s End moving",this.getBrand(),this.getModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Truck %s %s in pit-stop",this.getBrand(),this.getModel());
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(45,110);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(110, 220);
    }
}
