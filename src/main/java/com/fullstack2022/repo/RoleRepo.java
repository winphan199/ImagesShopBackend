package com.fullstack2022.repo;

import java.util.Optional;

import com.fullstack2022.entity.ERole;
import com.fullstack2022.entity.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
