import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final float engineVolume;

    public final List<Driver<?>> drivers = new ArrayList<>();
    public final List<Mechanic<?>> mechanics = new ArrayList<>();
    public final List<Sponsor> sponsors = new ArrayList<>();

    public Transport(String brand, String model, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public void addDriver(Driver<?> driver) {
        drivers.add(driver);
    }
    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public abstract void startMoving();

    public abstract void endMoving();

    public abstract void printType();

    public abstract void passDiagnostics();

    public abstract void repair() ;
}




