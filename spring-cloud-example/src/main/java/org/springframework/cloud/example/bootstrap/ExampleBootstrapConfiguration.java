package org.springframework.cloud.example.bootstrap;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author rtt
 * @date 2024/6/26 10:45
 */
//@Configuration(proxyBeanMethods = false)
public class ExampleBootstrapConfiguration {

    @Bean
    public ApplicationListener<ApplicationEvent> exampleBootstrapApplicationListener() {
        return new ExampleBootstrapApplicationListener();
    }

    static class ExampleBootstrapApplicationListener implements ApplicationListener<ApplicationEvent> {

        @Override
        public void onApplicationEvent(ApplicationEvent event) {
            System.out.println("[Bootstrap Listener]" + event.getClass());
        }
    }
}
