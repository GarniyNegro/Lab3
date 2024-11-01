import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Event implements Comparable<Event> {
    private int eventId;
    private String eventName;
    private String eventDate;
    private int roomId;
    private int eventSeats;

    // Default constructor for deserialization
    public Event() {
    }

    @JsonCreator
    protected Event(
            @JsonProperty("eventId") int eventId,
            @JsonProperty("eventName") String eventName,
            @JsonProperty("eventDate") String eventDate,
            @JsonProperty("roomId") int roomId,
            @JsonProperty("eventSeats") int eventSeats) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.roomId = roomId;
        this.eventSeats = eventSeats;
    }

    // Getters and Setters (if necessary)

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getEventSeats() {
        return eventSeats;
    }

    public void setEventSeats(int eventSeats) {
        this.eventSeats = eventSeats;
    }

    @Override
    public int compareTo(Event other) {
        return Integer.compare(this.eventId, other.eventId);
    }

    // Add any other methods you have
}
