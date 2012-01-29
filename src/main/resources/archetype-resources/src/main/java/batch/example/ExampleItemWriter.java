package ${package}.batch.example;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemWriter;

/**
 * <p>
 * {@link ItemWriter} that logs the data it recieves.
 * </p>
 */
public class ExampleItemWriter implements ItemWriter<String> {
    /**
     * <p>
     * The {@link Log} for this class.
     * </p>
     */
	private final Log log = LogFactory.getLog(getClass());

    /*
     * (non-Javadoc)
     * @see org.springframework.batch.item.ItemWriter#write(java.util.List)
     */
	public void write(List<? extends String> data) throws Exception {
		log.info(data);
	}
}
