package ${package}.batch.example;

import junit.framework.TestCase;
import org.springframework.batch.item.ItemReader;

/**
 * <p>
 * {@link TestCase} for the {@link ExampleItemReader} class.
 * </p>
 */
public class ExampleItemReaderTest extends TestCase {
    /**
     * <p>
     * The {@link ItemReader} to test.
     * </p>
     */
    private ItemReader<String> reader = new ExampleItemReader();

    /**
     * <p>
     * Asserts the first item read equals the expected value.
     * </p>
     *
     * @throws Exception if an {@link Exception} occurs
     */
    public void testReadOnce() throws Exception {
        assertEquals("Hello world!", reader.read());
    }

    /**
     * <p>
     * Asserts the second item read equals the expected value.
     * </p>
     *
     * @throws Exception if an {@link Exception} occurs
     */
    public void testReadTwice() throws Exception {
        reader.read();

        assertEquals(null, reader.read());
    }
}
