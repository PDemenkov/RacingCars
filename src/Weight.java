public enum Weight {
    N1(null, 3.5),
    N2(3.5, 12D),
    N3(12D, null);

    private Double from;
    private Double to;

    Weight(Double from, Double to) {
        this.from = from;
        this.to = to;
    }

    public Double getFrom() {
        return from;
    }

    public void setFrom(Double from) {
        this.from = from;
    }

    public Double getTo() {
        return to;
    }

    public void setTo(Double to) {
        this.to = to;
    }

    @Override
    public String toString() {
        String capacityFromString = from != null ? "от " + from : "" ;
        String capacityToString = to != null ? " до" + to + "тонн" : "";
        return "Грузоподъемность" + from + " " + to;
    }
}