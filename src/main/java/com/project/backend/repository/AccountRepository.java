package com.project.backend.repository;

import com.project.backend.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

	@Query(value = "select * from accounts where accounts.username like :username", nativeQuery = true)
    Optional<Account> findByUsername(@Param("username") String username);

	@Query(value = "select * from accounts where accounts.email like :email", nativeQuery = true)
    Account findByEmail (@Param("emai") String email);
}

