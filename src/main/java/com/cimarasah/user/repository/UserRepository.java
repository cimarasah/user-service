package com.cimarasah.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cimarasah.user.repository.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{

	List<UserEntity> findAll();
}
