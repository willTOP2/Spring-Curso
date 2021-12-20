package com.example.api.resources;

import com.example.api.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user" )

public class UserResource {

    @GetMapping(value = "/{id}")
  public ResponseEntity<User> findById() {

    return ResponseEntity.ok().body(new User(
            1, "Willian", "will@gmail.com", "123"
    ));
  }

}
