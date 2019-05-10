package com.safaricomhackathon.microservices.repository;

import com.safaricomhackathon.microservices.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <UserModel,Long>{
}
