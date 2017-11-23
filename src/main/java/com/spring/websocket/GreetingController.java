package com.spring.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by muhamd gomaa on 11/22/2017.
 */

    @Controller
    public class GreetingController {


        @MessageMapping("/hello")//if a message is sent to destination "/hello", then the greeting() method is called.
        @SendTo("/topic/greetings") //The return value is broadcast to all subscribers to "/topic/greetings
        public Greeting greeting(HelloMessage message) throws Exception {
            Thread.sleep(1000); // simulated delay
            return new Greeting("Hello, " + message.getName() + "!");

        }

    }
