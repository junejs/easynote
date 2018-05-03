package com.example.easynote.easynote.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {
    @MessageMapping("/hello")
    @SendTo("/topic/greettngs")
    public String hello(String message) {
        return "hello, " + message;
    }
}
