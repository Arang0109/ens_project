package com.damoya.ens.authentication.service;

import com.damoya.ens.authentication.domain.User;
import com.damoya.ens.authentication.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public Optional<User> getUserById(String userId) {
    return userRepository.findById(userId);
  }
}
