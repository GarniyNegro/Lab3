import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class EventService {

    private List<Event> eventList;

    public EventService(List<Event> eventList) {
        this.eventList = eventList;
    }

    public List<Event> findEventsByName(String eventName) {
        return eventList.stream()
                .filter(event -> event.getEventName().equalsIgnoreCase(eventName))
                .sorted((event1, event2) -> ((Comparable<Event>) event1).compareTo(event2)) // Використовуємо Comparable
                .collect(Collectors.toList());
    }


    public List<Event> sortEventsBySeats() {
        return eventList.stream()
                .sorted(Comparator.comparingInt(Event::getEventSeats))
                .collect(Collectors.toList());
    }

    public Event findEventById(int eventId) {
        return eventList.stream()
                .filter(event -> event.getEventId() == eventId)
                .findFirst()
                .orElse(null);
    }

    public List<Event> sortEventsByDate() {
        return eventList.stream()
                .sorted((event1, event2) -> ((Comparable<Event>) event1).compareTo(event2)) // Явно використовуємо Comparable
                .collect(Collectors.toList());
    }

}
