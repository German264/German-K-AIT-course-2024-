package homework_35.Event_Calendar.dao;

import homework_35.Event_Calendar.model.Event;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;


public class CalendarImpl implements Calendar {

    private Event[] events;
    private int size;

    public CalendarImpl(int capacity) {
        this.events = new Event[capacity];
    }

    // Comparator sort by eventDate
    Comparator<Event> comparator = (e1, e2) -> e1.getDate().compareTo(e2.getDate());

    @Override
    public boolean addEvent(Event event) {
        if(event == null || size == events.length){
            return false;
        }
        // Arrays.sort(events, comparator);
        // find index where insert event
        int index = Arrays.binarySearch(events, 0, size, event, comparator);
        index = index >=0 ? index : - index - 1;
        // Раздвигаем массив для вставки элемента
        System.arraycopy(events, index, events, index + 1, size - index);
        events[index] = event;
        size++;
        return true;
    }

    @Override
    public boolean removeEvent(LocalDateTime date) {
        for (int i = 0; i < size; i++) {
            if(events[i].getDate() == date){
                System.arraycopy(events, i + 1, events, i, size - i -1);
                events[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Event updateEvent(Event event) {
        // отыскать нужного в массиве и обновить ему поле
        for (int i = 0; i < size; i++) {
            if (events[i].getDate() == event.getDate()) {
                events[i] = event;
                return events[i];
            }
        }
        return null;
    }

    @Override
    public Event[] getEventFromCalendar(LocalDateTime date) {
        for (int i = 0; i < size; i++) {
            if(events[i].getDate() == date){
                return new Event[]{events[i]};
            }
        }
        return null;
    }

    @Override
    public Event[] getEventBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Event[0];
    }

    @Override
    public int size() {
        return 0;
    }
}
