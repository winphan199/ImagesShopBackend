package com.fullstack2022.payload.response;

import java.util.List;

import lombok.Data;

@Data
public class JwtResponse {
  private String token;
  private String type = "Bearer";
  private Long id;
  private String username;
  private String lastName;
  private String firstName;
  private String email;
  private List<String> roles;

  public JwtResponse(String accessToken, Long id, String username, String firstName, String lastName, String email, List<String> roles) {
    this.token = accessToken;
    this.id = id;
    this.username = username;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.roles = roles;
  }
}