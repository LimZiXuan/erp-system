package dev.erp_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.erp_system.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
