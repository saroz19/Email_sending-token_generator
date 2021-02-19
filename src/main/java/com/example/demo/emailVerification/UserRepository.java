package com.example.demo.emailVerification;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, String> {
	User findByEmailIdIgnoreCase(String emailId);

}
