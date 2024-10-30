package homework_35.Event_Calendar.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Event implements Comparable<Event>{

    private LocalDateTime date;

    public Event(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Event{");
        sb.append("date=").append(date);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event event)) return false;
        return Objects.equals(date, event.date);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(date);
    }

    @Override
    public int compareTo(Event o) {
        return this.getDate().compareTo(o.getDate());
    }
}
