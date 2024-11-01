// XmlSerializer.java
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;

public class XmlSerializer implements SerializableEntity<Event> {
    private final XmlMapper xmlMapper = new XmlMapper();

    @Override
    public void serialize(Event event, File file) throws Exception {
        xmlMapper.writeValue(file, event);
    }

    @Override
    public Event deserialize(File file) throws Exception {
        return xmlMapper.readValue(file, Event.class);
    }
}
