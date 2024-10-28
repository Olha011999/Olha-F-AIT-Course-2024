package classwork_33.season;

public enum Season {
    WINTER("Winter", 90,1), SPRING ("Spring", 92, 1),SUMMER("Summer", 92,1), AUTUMN("Autumn", 91, 1);

    //fields
    private String name;
    private int duration; //продолжительность
    private int number;

    Season(String name, int duration, int number) {
        this.name = name;
        this.duration = duration;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public int getNumber() {
        return number;
    }// используем только геттеры, так как менять не можем данные

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Season{");
        sb.append("name='").append(name).append('\'');
        sb.append(", duration=").append(duration);
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}
