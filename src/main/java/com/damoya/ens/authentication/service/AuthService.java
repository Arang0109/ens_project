package com.damoya.ens.authentication.service;

import com.damoya.ens.authentication.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
  private final UserRepository userRepository;

  private final String JWT_SECRET = "01055152835";  // JWT 서명 비밀키
  private final long JWT_EXPIRATION = 86400000;

  // login check
  public String authenticate(String userId, String password) {
    return String.format("My Secret Key: %s, UserId: %s, password: %s", JWT_SECRET, userId, password);
  }
}
