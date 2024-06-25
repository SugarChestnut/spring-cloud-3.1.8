package org.springframework.cloud.example.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import java.time.LocalDateTime;

public class ExampleApplicationListener implements ApplicationListener<ApplicationEvent> {

    /**
     * 会执行两次
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("[" + LocalDateTime.now().toString() + "]" + event.getClass());
    }
}
