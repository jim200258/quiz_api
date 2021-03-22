package com.appx.quiz.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/User")
public class UserController {

    @GetMapping("{id}")
    public ResponseEntity<String> getProduct(@PathVariable("id") String id) {
        return ResponseEntity.ok(id);
    }
}
