package io.javabrains.springsecurityjpa;

import io.javabrains.springsecurityjpa.models.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserData, Integer> {
    Optional<UserData> findByUserName(String userName);
}
