package org.springframework.cloud.example;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(ExampleApplication.class)
                .properties("spring.cloud.bootstrap.enabled=true")
                .web(WebApplicationType.NONE)
                .run(args);

        applicationContext.close();
    }
}
