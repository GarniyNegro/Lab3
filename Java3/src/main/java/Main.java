import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створити кілька заходів
        Event event1 = new Event(1, "Symphony Orchestra", "2024-11-15", 101, 500);

        // Серіалізація в JSON, XML та YAML
        JsonSerializer jsonSerializer = new JsonSerializer();
        XmlSerializer xmlSerializer = new XmlSerializer();
        YamlSerializer yamlSerializer = new YamlSerializer();

        try {
            // Серіалізація
            jsonSerializer.serialize(event1, new File("event1.json"));
            xmlSerializer.serialize(event1, new File("event1.xml"));
            yamlSerializer.serialize(event1, new File("event1.yaml"));

            // Десеріалізація з JSON
            Event deserializedEventFromJson = jsonSerializer.deserialize(new File("event1.json"));
            System.out.println("Deserialized Event from JSON: " + deserializedEventFromJson);

            // Вивести інформацію про захід з JSON
            printEventDetails(deserializedEventFromJson, "JSON");

            // Десеріалізація з XML
            Event deserializedEventFromXml = xmlSerializer.deserialize(new File("event1.xml"));
            System.out.println("Deserialized Event from XML: " + deserializedEventFromXml);

            // Вивести інформацію про захід з XML
            printEventDetails(deserializedEventFromXml, "XML");

            // Десеріалізація з YAML
            Event deserializedEventFromYaml = yamlSerializer.deserialize(new File("event1.yaml"));
            System.out.println("Deserialized Event from YAML: " + deserializedEventFromYaml);

            // Вивести інформацію про захід з YAML
            printEventDetails(deserializedEventFromYaml, "YAML");

        } catch (Exception e) {
            e.printStackTrace(); // Виводить деталі помилки
        }
    }

    private static void printEventDetails(Event event, String format) {
        System.out.println("Event Details from " + format + ":");
        System.out.println("ID: " + event.getEventId());
        System.out.println("Name: " + event.getEventName());
        System.out.println("Date: " + event.getEventDate());
        System.out.println("Room ID: " + event.getRoomId());
        System.out.println("Seats: " + event.getEventSeats());
        System.out.println();
    }
}
