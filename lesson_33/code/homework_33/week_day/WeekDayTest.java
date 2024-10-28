package homework_33.week_day;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekDayTest {

    @BeforeEach
    void setUp() {
        // Устанавливаем начальный день перед каждым тестом
        WeekDay startDay = WeekDay.MONDAY;
    }

    @Test
    public void testValues() {
        // Проверяем, что метод values() возвращает все дни недели
        WeekDay[] days = WeekDay.values();
        assertEquals(7, days.length);
    }

    @Test
    public void testToString() {
        // Проверка toString() для MONDAY
        WeekDay day = WeekDay.MONDAY;
        assertEquals("WeekDay{day='Monday', number=1}", day.toString());
    }

    @Test
    public void testOrdinal() {
        // Проверка ordinal() для MONDAY
        WeekDay day = WeekDay.MONDAY;
        assertEquals(0, day.ordinal());//"Порядковый номер для MONDAY должен быть 0
    }

    @Test
    public void testValueOf() {
        // Проверка valueOf() для FRIDAY
        WeekDay day = WeekDay.valueOf("FRIDAY");
        assertEquals(WeekDay.FRIDAY, day);
    }

    @Test
    public void testPlusDays() {
        WeekDay startDay = WeekDay.MONDAY;
        WeekDay expectedDay = WeekDay.THURSDAY; // Понедельник + 10 дней = Четверг
        WeekDay resultDay = startDay.plusDays(10);
        assertEquals(expectedDay, resultDay);
    }


}