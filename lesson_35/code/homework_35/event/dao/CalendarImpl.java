package homework_35.event.dao;

import homework_35.event.model.Event;

import java.time.LocalDate;
import java.util.Comparator;

public class CalendarImpl implements Calendar{

    private Event[] events;
    private int size;

    public CalendarImpl(int capasity) {
        this.events = new Event[capasity];
        this.size = 0;
    }


    // Comparator sort by EventId then by photoId
    Comparator<Event> comparator = (e1, e2) -> {
        int res = Integer.compare(e1.getEventId(), e2.getEventId());
        return res !=0 ? res : e1.getTime().compareTo(e2.getTime());
    };
    @Override
    public boolean addEvent(Event event) {
        if (event == null || size == events.length){
            return false;
        } for (int i = 0; i < size; i++) {
            if (events[i].getEventId() == event.getEventId()) {
                return false;
            }
        }
        events[size++] = event;
        return true;
    }

    @Override
    public boolean removeEvent(int eventId) {
        for (int i = 0; i < size; i++) {
            if (events[i].getEventId() == eventId) {
                System.arraycopy(events, i + 1, events, i, size - i - 1);
                events[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateEvent(int eventId, String description) {
        Event event = getEvent(eventId);
        if (event == null) {
            return false;
        }
        event.setDescription(description);
        return true;
//        for (int i = 0; i < size; i++) {
//            if(events[i].getEventId() == eventId && events[i].getDescription() == description){
//                System.arraycopy(events, i + 1, events, i, size - i -1);
//                events[--size] = null;
//                return true;
//            }
//        }
//        return false;
    }

    @Override
    public Event getEvent(int eventId) {
        for (int i = 0; i < size; i++) {
            if (events[i].getEventId() == eventId) {
                return events[i];
            }
        }
        return null;
    }

    @Override
    public Event[] getAllEventsOnDate(LocalDate date) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (events[i].getTime().toLocalDate().equals(date)) {
                count++;
            }
        }
        Event[] result = new Event[count];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (events[i].getTime().toLocalDate().equals(date)) {
                result[index++] = events[i];
            }
        }
        return result;
    }

    @Override
    public Event[] getEventsBetweenDates(LocalDate startDate, LocalDate endDate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            LocalDate eventDate = events[i].getTime().toLocalDate();
            if ((eventDate.isEqual(startDate) || eventDate.isAfter(startDate)) &&
                    (eventDate.isEqual(endDate) || eventDate.isBefore(endDate))) {
                count++;
            }
        }
        Event[] result = new Event[count];
        int index = 0;
        for (int i = 0; i < size; i++) {
            LocalDate eventDate = events[i].getTime().toLocalDate();
            if ((eventDate.isEqual(startDate) || eventDate.isAfter(startDate)) &&
                    (eventDate.isEqual(endDate) || eventDate.isBefore(endDate))) {
                result[index++] = events[i];
            }
        }
        return result;
    }

    @Override
    public int size() {
        return size;
    }
}
