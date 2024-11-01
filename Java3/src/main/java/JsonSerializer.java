// JsonSerializer.java
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonSerializer implements SerializableEntity<Event> {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void serialize(Event event, File file) throws Exception {
        objectMapper.writeValue(file, event);
    }

    @Override
    public Event deserialize(File file) throws Exception {
        return objectMapper.readValue(file, Event.class);
    }
}
