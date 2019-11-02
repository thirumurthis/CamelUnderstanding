package com.sample.pck;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class HelloRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		System.out.println("Inside route builder...");
		from("file:C:/thiru/camel/input/")
		.split().tokenize("\n")
		.to("direct:hello");
		
		from("direct:hello")
		.process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				String message = exchange.getIn().getBody(String.class);
				HelloBean hello = new HelloBean(); //instance of the helloBean
				exchange.getOut().setBody(hello.hello(" - "+message));//invokes hello bean
			}
		}).to("file:C:/thiru/camel/output");
	}


}
