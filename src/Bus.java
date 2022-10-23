import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing{
    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.printf("Bus %s %s Star moving",this.getBrand(),this.getModel());
    }

    @Override
    public void endMoving() {
        System.out.printf("Bus %s %s End moving",this.getBrand(),this.getModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Bus %s %s in pit-stop",this.getBrand(),this.getModel());
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(90,150);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(100, 180);
    }
}
