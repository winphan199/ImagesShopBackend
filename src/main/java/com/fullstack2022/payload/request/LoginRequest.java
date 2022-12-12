package com.fullstack2022.payload.request;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class LoginRequest {
	// @NotBlank
  	// private String username;

	@NotBlank
  	private String email;

	@NotBlank
	private String password;
}