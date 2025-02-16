package com.damoya.ens.authentication.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Table(name = "user")
public class User {
  @Id
  @Column(name = "user_id")
  private String id;

  private String password;

  @Column(name = "name")
  private String username;

  private String email;
}