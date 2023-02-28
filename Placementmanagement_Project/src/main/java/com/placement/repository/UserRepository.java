package com.placement.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.placement.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>  {

}
