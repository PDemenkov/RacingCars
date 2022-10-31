
public enum TypeOfBody {
    TYPE_SEDAN("Седан"),
    TYPE_HATCHBACK("Хэтчбэк"),
    TYPE_COUPE("Купэ"),
    TYPE_UNIVERSAL("Универсал"),
    TYPE_SUV("Внедорожник"),
    TYPE_CROSSOVER("Кроссовер"),
    TYPE_PICKUP("Пикап"),
    TYPE_VAN("Фургон"),
    TYPE_MINIVAN("Минивэн");

    private final String name;

    TypeOfBody(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Тип кузова " + this.name;
    }
}