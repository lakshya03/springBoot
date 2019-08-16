package com.example.demo;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.example.demo.rabbit.Publisher;
import com.example.demo.rabbit.Subscriber;

@SpringBootApplication
@EnableScheduling
public class BasicRabbitMqApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(BasicRabbitMqApplication.class, args);
		Publisher publisher= ctx.getBean(Publisher.class);
		publisher.send();
//		if we comment above line and uncomment the @bean from subscriber then tghe msg in queue is consumed by subscriber

		
	}

	@Bean
	public Queue queue() {
		return new Queue("spice-jet-orders");
	}
	
	
	public RabbitTemplate template() {
		return new RabbitTemplate();
	}
	
	@Bean
	public Publisher publisher() {
		return new Publisher();
	}
	
	@Bean
	public Subscriber subscriber() {
		return new Subscriber();
	}
}
