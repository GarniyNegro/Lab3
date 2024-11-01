import java.util.List;
import java.util.stream.Collectors;

public class RoomService {
    private List<Room> rooms;

    public RoomService(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getAvailableRooms(int minimumSeats) {
        return rooms.stream()
                .filter(room -> room.getSeatCapacity() >= minimumSeats)
                .collect(Collectors.toList());
    }
}
