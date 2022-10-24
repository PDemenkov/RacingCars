import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing {
    private TypeOfBody typeOfBody;

    public Car(String brand, String model, float engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
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
    public void printType() {
        if (typeOfBody == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип кузова: " + typeOfBody);
        }
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
