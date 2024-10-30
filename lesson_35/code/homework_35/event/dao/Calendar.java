package homework_35.event.dao;

import homework_35.event.model.Event;

import java.time.LocalDate;

public interface Calendar {

    boolean addEvent(Event event);
    boolean removeEvent(int eventId);
    boolean updateEvent(int eventId, String description);
    Event getEvent(int eventId);
    Event[] getAllEventsOnDate(LocalDate date);
    Event[] getEventsBetweenDates(LocalDate startDate, LocalDate endDate);
    int size();

}
