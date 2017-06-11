package com.example.aggregate;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.aggregate.AggregateApplicationBuilder;

import com.example.processor.ProcessorTwo;
import com.example.processor.ProcessorThree;
import com.example.processor.ProcessorOne;
import com.example.processor.ProcessorFour;
import com.example.sink.LoggingSinkApplication;
import com.example.source.JSONFileSourceApplication;

@SpringBootApplication
public class PlainAggregateApplication {
	
	public static void main(String[] args) {
		
		new AggregateApplicationBuilder()
		.from(JSONFileSourceApplication.class).args("--fixedDelay=5000")
		.via(ProcessorOne.class)
		.via(ProcessorTwo.class)
		.via(ProcessorThree.class)
		.via(ProcessorFour.class)
		.to(LoggingSinkApplication.class).run(args);
		
	}
	
}
