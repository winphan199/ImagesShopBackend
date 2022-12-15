package com.fullstack2022.payload.response;

import java.util.List;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class JwtResponse {
  private final String type = "Bearer";
  private final String token;
  private final Long id;
  private final String username;
  private final String lastName;
  private final String firstName;
  private final String email;
  private final List<String> roles;
}