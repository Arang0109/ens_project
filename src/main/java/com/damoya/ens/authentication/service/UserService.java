package com.damoya.ens.authentication.service;

import com.damoya.ens.authentication.domain.User;
import com.damoya.ens.authentication.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }
}
