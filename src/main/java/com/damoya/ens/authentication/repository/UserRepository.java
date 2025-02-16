package com.damoya.ens.authentication.repository;

import com.damoya.ens.authentication.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}