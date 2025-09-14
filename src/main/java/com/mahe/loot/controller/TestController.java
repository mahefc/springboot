package com.mahe.loot.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mahe.loot.enums.UserKey;
import com.mahe.loot.services.Logger;


@RestController
public class TestController {

    @Autowired
    private Logger logger;

    @GetMapping("/test")
    public Map<UserKey, Object> test() {
        logger.info("Hello world endpoint was called");
        Map<UserKey, Object> users = Map.of(
            UserKey.userName, "admin",
            UserKey.timeoutSeconds, 120,
            UserKey.roles, List.of("editor", "viewer"),
            UserKey.isActive, true
        );
        return users;
    }

    @GetMapping("/test2")
    public List<Map<String, Object>> getUsers() {
        // Create a List of Maps to represent multiple user objects
        Map<String, Object> user1 = Map.of(
            "id", 101,
            "username", "alex"
        );
        
        // Return the List
        return List.of(user1);
    }

    @PostMapping("/log")
    public String logName(@RequestBody Map<String, String> body) {
        String name = body.get("name");
        logger.info("Name from body: " + name);
        return "Logged successfully";
    }

    @PutMapping("/edit-log")
    public String editLog(@RequestBody Map<String, String> body) {
        String name = body.get("name");
        logger.info("Name from body: " + name);
        return "Logged successfully";
    }



}