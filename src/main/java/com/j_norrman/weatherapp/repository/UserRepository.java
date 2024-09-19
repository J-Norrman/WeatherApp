package com.j_norrman.weatherapp.repository;

import com.j_norrman.weatherapp.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
