import java.util.Objects;
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
    public void passDiagnostics() {
        if (ThreadLocalRandom.current().nextBoolean()) {
            throw new DiagnosticsException("Грузовик " + getBrand() +" "+ getModel() + " не прошел диагностику");
        }
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

    @Override
    public void repair() {
        System.out.println("Грузовик" + getBrand() + getModel() +" отремонтирован");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return weight == truck.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }
}
