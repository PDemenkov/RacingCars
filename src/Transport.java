import java.util.*;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final float engineVolume;

    public final Set<Driver<?>> drivers = new HashSet<>();
    public final Set<Mechanic<?>> mechanics = new HashSet<>();
    public final Set<Sponsor> sponsors = new HashSet<>();

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

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(drivers, transport.drivers) && Objects.equals(mechanics, transport.mechanics) && Objects.equals(sponsors, transport.sponsors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, drivers, mechanics, sponsors);
    }
}




