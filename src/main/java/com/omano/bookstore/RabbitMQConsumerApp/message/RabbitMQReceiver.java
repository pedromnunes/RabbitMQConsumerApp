package com.omano.bookstore.RabbitMQConsumerApp.message;

import com.omano.bookstore.RabbitMQConsumerApp.domain.Book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQReceiver implements RabbitListenerConfigurer{

    private static final Logger log = LoggerFactory.getLogger(RabbitMQReceiver.class);

    @Override
    public void configureRabbitListeners(RabbitListenerEndpointRegistrar registrar) {
        // This methos stay empty.
    }

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void receive(Book book){

        book.setPrice(120.89); 

        log.info("Book's Details Received are: \n {}", book);
    }
    
}
