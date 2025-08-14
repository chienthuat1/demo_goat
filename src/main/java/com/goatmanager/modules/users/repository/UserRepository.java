package com.goatmanager.modules.users.repository;

import com.goatmanager.modules.users.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    @Query("SELECT u.username FROM Users u")
    List<String> findByUsername();
}
