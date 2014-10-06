package logs;

import org.slf4j.*;
public class Hello {
    static Logger LOGGER = LoggerFactory.getLogger(Hello.class);
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            if (i % 2 == 0)
                LOGGER.info("Hello {}", i);
            else
                LOGGER.debug("I am on index {}", i);
    }
}
