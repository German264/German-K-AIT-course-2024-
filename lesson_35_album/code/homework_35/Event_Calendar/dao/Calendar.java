package homework_35.Event_Calendar.dao;

import homework_35.Event_Calendar.model.Event;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Calendar {

    boolean addEvent(Event event);
    boolean removeEvent(LocalDateTime event);
    Event updateEvent(Event event);
    Event[] getEventFromCalendar(LocalDateTime date);
    Event[] getEventBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    int size();
}
