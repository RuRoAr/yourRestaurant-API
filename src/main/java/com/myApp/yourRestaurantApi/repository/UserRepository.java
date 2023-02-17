package com.myApp.yourRestaurantApi.repository;

import com.myApp.yourRestaurantApi.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAll();

   // @Query(value = "SELECT * FROM users WHERE email LIKE :email AND password LIKE :password")
   //@Query("SELECT u FROM User u WHERE u.status = ?1 and u.name = ?2")
   @Query(value= "SELECT * FROM Users u WHERE u.email = :email and u.password  = :password", nativeQuery = true)
    User getUserByEmailAndPassword(@Param("email") String email, @Param("password") String password);
}