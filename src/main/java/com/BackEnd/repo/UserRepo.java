package com.BackEnd.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.BackEnd.Entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	
	
	@Query(value="select * from user where username=?1 and password=?2", nativeQuery = true)
	public User findByUserNameAndPassword(String username, String password);
}
