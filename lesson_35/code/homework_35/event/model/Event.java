package homework_35.event.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Event implements Comparable<Event> {

    private int eventId;
    private String description;
    private LocalDateTime time;

    public Event(int eventId, String description, LocalDateTime time) {
        this.eventId = eventId;
        this.description = description;
        this.time = time;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event event)) return false;
        return eventId == event.eventId && Objects.equals(description, event.description) && Objects.equals(time, event.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, description, time);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Event{");
        sb.append("eventId=").append(eventId);
        sb.append(", description='").append(description).append('\'');
        sb.append(", time=").append(time);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Event o) {
        return this.description.compareTo(o.getDescription());
    }
}
