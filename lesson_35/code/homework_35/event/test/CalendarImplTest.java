package homework_35.event.test;

import homework_35.event.dao.CalendarImpl;
import homework_35.event.model.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CalendarImplTest {
    CalendarImpl calendar;
    Event[] events;
    LocalDateTime now = LocalDateTime.now();

    @BeforeEach
    void setUp() {
        calendar = new CalendarImpl(10);
        events = new Event[5];
        events[0] = new Event(1, "Birthday",  now.minusDays(1));
        events[1] = new Event(2, "Workout", now.minusDays(2));
        events[2] = new Event(3, "Family",  now);
        events[3] = new Event(4, "Dentist", now.plusDays(1));
        events[4] = new Event(5, "Flight",  now.plusDays(2));
        for (Event event : events) {
            calendar.addEvent(event);
        }
    }

    @Test
    void addEvent() {
        assertFalse(calendar.addEvent(null));
        assertFalse(calendar.addEvent(events[1]));
        Event event = new Event(6, "Shopping", now.plusDays(3));
        assertTrue(calendar.addEvent(event));
        assertEquals(6, calendar.size());
    }

    @Test
    void removeEvent() {
        assertTrue(calendar.removeEvent(1));
        assertFalse(calendar.removeEvent(10));
        assertEquals(4, calendar.size());
    }

    @Test
    void updateEvent() {
        assertTrue(calendar.updateEvent(1, "Birthday"));
        assertEquals("Birthday", calendar.getEvent(1).getDescription());
    }

    @Test
    void getAllEventsOnDate() {
        Event[] expected = {events[2]};
        assertArrayEquals(expected, calendar.getAllEventsOnDate(LocalDate.now()));
    }

    @Test
    void getEventsBetweenDates() {
        LocalDate startDate = LocalDate.now().minusDays(2);
        LocalDate endDate = LocalDate.now().plusDays(1);
        Event[] expected = {events[0], events[1], events[2], events[3]};
        assertArrayEquals(expected, calendar.getEventsBetweenDates(startDate, endDate));
    }

    @Test
    void size() {
        assertEquals(5, calendar.size());
    }
}