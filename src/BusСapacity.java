public enum BusСapacity {
    VERY_LOW(0, 10),
    LOW(10, 25),
    AVERAGE(40, 50),
    BIG(60, 80),
    VERY_BIG(100, 120);

    private int from;
    private int to;

    BusСapacity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    @Override
    public String toString() {
        String capacity = from > 0 ? from + " - " + to : String.valueOf(to);
        return "Вместимость: " +name() +" "+  (capacity + " мест");
    }
}