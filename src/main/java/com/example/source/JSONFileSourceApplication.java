package com.example.source;

import java.io.IOException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;

@SpringBootApplication
@EnableBinding(Source.class)
public class JSONFileSourceApplication {
	
	@InboundChannelAdapter(value = Source.OUTPUT)
    public String greet() throws IOException {
		return "Source-->";
    }
}
