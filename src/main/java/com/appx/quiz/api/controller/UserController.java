package com.appx.quiz.api.controller;

import com.appx.quiz.api.dao.UserRepository;
import com.appx.quiz.api.dao.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/User")
public class UserController {

    @Autowired
    UserRepository userRespository;

    @GetMapping("{id}")
    public ResponseEntity<String> getProduct(@PathVariable("id") String id) {
        return ResponseEntity.ok(id);
    }

    @GetMapping("")
    public ResponseEntity<List<UsersDao>> findAll(){
        List<UsersDao> list = userRespository.findAll();
        return ResponseEntity.ok(list);
    }
}
