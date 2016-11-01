package fr.lang;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by philippe on 30/10/2016.
 */
@SpringBootApplication
public class ConsoRestConfiguration {
    private static final Logger log = LoggerFactory.getLogger(ConsoRestConfiguration.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsoRestConfiguration.class, args);
    }

}
