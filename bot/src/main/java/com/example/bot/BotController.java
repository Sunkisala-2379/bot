package com.example.bot;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/v1")
public class BotController {


    @GetMapping("/healthz")
    public Map<String, String> health() {
        return Map.of(
                "status", "ok",
                "service", "MyBot",
                "time", new Date().toString()
        );
    }

    @GetMapping("/metadata")
    public Map<String, String> metadata() {
        return Map.of(
                "name", "MyBot",
                "version", "1.0",
                "author", "Mythili",
                "project", "Magicpin AI Challenge Bot",
                "description", "A simple backend bot built using Spring Boot APIs",
                "status", "active"
        );
    }


    @PostMapping("/context")
    public Map<String, Object> context(@RequestBody Map<String, Object> req) {
        return Map.of(
                "status", "context received",
                "data", req
        );
    }


    @PostMapping("/tick")
    public Map<String, Object> tick(@RequestBody Map<String, Object> req) {
        return Map.of(
                "status", "tick processed",
                "timestamp", new Date().toString()
        );
    }


    @PostMapping("/reply")
    public Map<String, Object> reply(@RequestBody Map<String, Object> req) {
        return Map.of(
                "reply", "Hello! I am Mythili" ,
                "status", "success"
        );
    }
}