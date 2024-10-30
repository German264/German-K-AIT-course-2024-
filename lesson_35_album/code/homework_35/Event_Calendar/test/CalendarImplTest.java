package homework_35.Event_Calendar.test;

import album.dao.AlbumImpl;
import album.model.Photo;
import homework_35.Event_Calendar.dao.Calendar;
import homework_35.Event_Calendar.dao.CalendarImpl;
import homework_35.Event_Calendar.model.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;
class CalendarImplTest {

    Calendar calendar;
    Event[] events;

    LocalDateTime now = LocalDateTime.now();

    // Comparator sort by eventDate
    Comparator<Event> comparator = (e1, e2) -> e1.getDate().compareTo(e2.getDate());

    @BeforeEach
    void setUp() {

        calendar = new CalendarImpl(5);
        events = new Event[4];

        events[0] = new Event(now.minusDays(10));
        events[1] = new Event(now.minusDays(4));
        events[2] = new Event(now.minusDays(6));
        events[3] = new Event(now.minusDays(8));
    }

    @Test
    void testAddEvent() {
        assertFalse(calendar.addEvent(null));
        assertFalse(calendar.addEvent(events[1]));
        Event event = new Event(now.minusDays(7));
        assertTrue(calendar.addEvent(event));
        assertEquals(5, calendar.size());
        event = new Event(now.minusDays(5));
        assertFalse(calendar.addEvent(event));
    }

    @Test
    void testRemoveEvent() {
        assertTrue(calendar.removeEvent(now.minusDays(10)));
        assertFalse(calendar.removeEvent(now.minusDays(11)));
        assertEquals(3, calendar.size());
    }

    @Test
    void testUpdateEvent() {
        // Обновляем событие с датой, соответствующей events[1]
        //Event updatedEvent = new Event(now.minusDays(4));
        // Вызываем метод updateEvent
        // Event result = calendar.updateEvent(updatedEvent);
        // Проверяем, что обновление прошло успешно
        // assertNotNull(result);
        // assertEquals(now.minusDays(4), result.getDate());
        // Проверяем, что размер календаря не изменился
        // assertEquals(4, calendar.size());

    }

    @Test
    void testGetEventFromCalendar() {
        assertEquals(events[1], calendar.getEventFromCalendar(now.minusDays(10)));
        assertNull(calendar.getEventFromCalendar(now.minusDays(12)));
    }

    @Test
    void testGetEventBetweenDate() {
        LocalDate today = LocalDate.now();
        Event[] actual = calendar.getEventBetweenDate(today.minusDays(4), today.minusDays(7));
        Arrays.sort(actual, comparator);
        Event[] expected = {events[2], events[1]};
        Arrays.sort(expected, comparator);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testSize() {
        assertEquals(4, calendar.size());
    }
}