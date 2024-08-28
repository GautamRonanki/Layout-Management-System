package com.terralogic.layoutmanagementservice.repository;

import com.terralogic.layoutmanagementservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
