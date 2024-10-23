package homework_30.date_sort_test;

import java.util.Objects;

public class DateSort implements Comparable<DateSort>{

    int day;
    int month;
    int year;

    @Override
    public int compareTo(DateSort o) {
        return Integer.compare(this.getDay(), o.getDay());
    }

    public DateSort(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DateSort dateSort)) return false;
        return day == dateSort.day && month == dateSort.month && year == dateSort.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public String toString() {
        return String.format("%02d-%02d- %d", day, month, year);
    }
}
