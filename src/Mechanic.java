public class Mechanic <T extends Transport> {
    private final String name;
    private final String surName;
    private final String company;

    public Mechanic(String name, String surName, String company) {
        this.name = name;
        this.surName = surName;
        this.company = company;
    }

    public void service(T t) {
        t.passDiagnostics();
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getCompany() {
        return company;
    }

    public void repair(T t) {
        t.repair();

    }

    @Override
    public String toString() {
        return name + " " + surName + ", из " + company;
    }
}
