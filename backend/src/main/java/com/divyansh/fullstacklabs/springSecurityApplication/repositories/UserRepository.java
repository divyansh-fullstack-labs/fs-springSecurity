package com.divyansh.fullstacklabs.springSecurityApplication.repositories;

import com.divyansh.fullstacklabs.springSecurityApplication.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String username);
}
