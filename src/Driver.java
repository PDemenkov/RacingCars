public abstract class Driver<T extends Transport> {
    private final String fullName;
    private final String category;
    private final int driverExp;
private final T car;

    public Driver(String fullName, String category, int driverExp,T car) {
        this.fullName = fullName;
        this.category = category;
        this.driverExp = driverExp;
        this.car = car;
    }
    public void startMoving() {
        System.out.printf("Driver %s start moving", this.fullName);
        this.car.startMoving();
    }

    public void stopMoving() {
        System.out.printf("Driver %s stop moving", this.fullName);
        this.stopMoving();

    }

    public void refill() {
        System.out.printf("Driver %s refilling the %s %s",
                this.fullName, this.car.getBrand(), this.car.getModel());
    }

    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public int getDriverExp() {
        return driverExp;
    }

    @Override
    public String toString() {
        return String.format("Driver %s rules auto %s %s and will be able to begin racing",
                this.fullName,this.car.getBrand(),this.car.getModel());
    }
}
