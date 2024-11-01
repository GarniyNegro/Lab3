// EventBuilder.java
public class EventBuilder {
    private int eventId;
    private String eventName;
    private String eventDate;
    private int roomId;
    private int eventSeats;

    public EventBuilder setEventId(int eventId) {
        this.eventId = eventId;
        return this;
    }

    public EventBuilder setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    public EventBuilder setEventDate(String eventDate) {
        this.eventDate = eventDate;
        return this;
    }

    public EventBuilder setRoomId(int roomId) {
        this.roomId = roomId;
        return this;
    }

    public EventBuilder setEventSeats(int eventSeats) {
        this.eventSeats = eventSeats;
        return this;
    }

    public Event build() {
        return new Event(eventId, eventName, eventDate, roomId, eventSeats);
    }
}
