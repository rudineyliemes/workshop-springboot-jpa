package com.estudos.course.resources;

import com.estudos.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Rudiney", "rudi@teste.com.br", "5121219000", "12345");
        return ResponseEntity.ok().body(u);
    }
}
