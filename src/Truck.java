import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing {
    private Weight weight;

    public Truck(String brand, String model, float engineVolume, Weight weight) {
        super(brand, model, engineVolume);
        this.weight = weight;
    }

    @Override
    public void startMoving() {
        System.out.printf("Truck %s %s Start moving", this.getBrand(), this.getModel());
    }

    @Override
    public void endMoving() {
        System.out.printf("Truck %s %s End moving", this.getBrand(), this.getModel());
    }

    @Override
    public void printType() {
        if (this.weight != null) {
            System.out.println(this.weight);
        } else {
            System.out.println("Информации недостаточно");
        }
    }

    @Override
    public boolean service() {
        return Math.random() >0.75;
    }

    @Override
    public void pitStop() {
        System.out.printf("Truck %s %s in pit-stop", this.getBrand(), this.getModel());
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(45, 110);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(110, 220);
    }
}
