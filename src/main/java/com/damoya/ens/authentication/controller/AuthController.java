package com.damoya.ens.authentication.controller;

import com.damoya.ens.authentication.domain.User;
import com.damoya.ens.authentication.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
  private final AuthService authService;

  @PostMapping("/login")
  public ResponseEntity<?> login(@RequestBody User user) {
    String token = authService.authenticate(user.getId(), user.getPassword());
    return ResponseEntity.ok(token);
  }
}