package other;

/**
 * SINGLETON PATTERN
 * to get id for new objects, id will be always sequential and unique
 */
public class IdGenerator {
    private static int id = 0;

    private static IdGenerator idGenerator = null;

    private IdGenerator() {

    }

    public static IdGenerator getInstance() {
        if (idGenerator == null) {
            idGenerator = new IdGenerator();
        }

        return idGenerator;
    }

    public int getId() {
        return ++id;
    }
}
