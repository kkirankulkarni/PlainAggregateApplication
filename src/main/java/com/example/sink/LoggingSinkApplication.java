package com.example.sink;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;


@SpringBootApplication
@EnableBinding(Sink.class)
public class LoggingSinkApplication {

	@ServiceActivator(inputChannel=Sink.INPUT)
    public void log(String message) {
        System.out.println(message+"Sink");
    }
}
