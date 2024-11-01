import java.util.Objects;

/**
 * Клас представляє інформацію про кімнату у філармонії.
 */
public class Room {
    private int roomId;
    private int seatCapacity;

    public Room(int roomId, int seatCapacity) {
        this.roomId = roomId;
        this.seatCapacity = seatCapacity;
    }

    // Getters and Setters

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", seatCapacity=" + seatCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomId == room.roomId && seatCapacity == room.seatCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId, seatCapacity);
    }
}
