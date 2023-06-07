package com.ust.user_Login.repository;

import com.ust.user_Login.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
