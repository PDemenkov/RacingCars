public abstract class Transport {
    private final String brand;
    private final String model;
    private final float engineVolume;

    public Transport(String brand, String model, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public abstract void startMoving();

    public abstract void endMoving();

    public abstract void printType();

    public abstract boolean service();
}


