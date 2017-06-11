package com.example.processor;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.Transformer;

@SpringBootApplication
@EnableBinding(Processor.class)
public class ProcessorFour {
	
	@Transformer(inputChannel = "input", outputChannel = "output")
	public String processMessage(String payload) {
		return payload + "Four-->";
    }
    
}
