package ${package}.batch.example;

import org.springframework.batch.item.ItemReader;

/**
 * <p>
 * {@link ItemReader} that reads hard-coded input data.
 * </p>
 */
public class ExampleItemReader implements ItemReader<String> {
    /**
     * <p>
     * The index of the item.
     * </p>
     */
    private int index = 0;

    /**
     * <p>
     * The input to read.
     * </p>
     */
    private String[] input = { "Hello world!", null };

    /*
     * (non-Javadoc)
     * @see org.springframework.batch.item.ItemReader#read()
     */
    public String read() throws Exception {
        if (index < input.length) {
            return input[index++];
        }

        return null;
    }
}
