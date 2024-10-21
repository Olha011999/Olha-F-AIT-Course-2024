package homework_27.high_school.model;

import java.util.Arrays;
import java.util.Objects;

public class HighSchool {

    private Person[] persone;
    private int count; // Отслеживает количество людей

    public HighSchool(int size) {
        this.persone = new Person[size];
        this.count = count;
    }

    public Person[] getPeople() {
        return persone;
    }

    public void setPeople(Person[] people) {
        this.persone = people;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HighSchool that)) return false;
        return count == that.count && Objects.deepEquals(persone, that.persone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(persone), count);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HighSchool{");
        sb.append("people=").append(Arrays.toString(persone));
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
