// SerializableEntity.java
import java.io.File;

public interface SerializableEntity<T> {
    void serialize(T entity, File file) throws Exception;
    T deserialize(File file) throws Exception;
}
