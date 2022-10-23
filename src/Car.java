import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing {
    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.printf("Car %s %s Start moving", this.getBrand(), this.getModel());
    }

    @Override
    public void endMoving() {
        System.out.printf("Car %s %s End moving", this.getBrand(), this.getModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Car %s %s in pit-stop", this.getBrand(), this.getModel());
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(50, 90);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(150, 260);
    }
}
