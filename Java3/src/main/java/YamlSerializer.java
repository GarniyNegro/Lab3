// YamlSerializer.java
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.File;

public class YamlSerializer implements SerializableEntity<Event> {
    private final YAMLMapper yamlMapper = new YAMLMapper();

    @Override
    public void serialize(Event event, File file) throws Exception {
        yamlMapper.writeValue(file, event);
    }

    @Override
    public Event deserialize(File file) throws Exception {
        return yamlMapper.readValue(file, Event.class);
    }
}
