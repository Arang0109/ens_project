package com.damoya.ens.authentication.service;

import com.damoya.ens.authentication.domain.User;
import com.damoya.ens.authentication.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(properties = "spring.main.banner-mode=off")
@Transactional
class UserServiceTest {
  @Autowired
  UserService userService;
  @Autowired
  private UserRepository userRepository;

  @BeforeEach
  void setUp() {
    User test = User.builder()
        .id("test")
        .password("1234")
        .username("테스트유저")
        .email("test@test.com")
        .build();
    userRepository.save(test);
  }

  @Test
  void getUserById() {
    Optional<User> user  = userService.getUserById("test");
    assertTrue(user.isPresent());
  }
}