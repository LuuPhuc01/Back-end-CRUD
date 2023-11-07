package com.codewithLP.BackendCRUD.repository;

import com.codewithLP.BackendCRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
