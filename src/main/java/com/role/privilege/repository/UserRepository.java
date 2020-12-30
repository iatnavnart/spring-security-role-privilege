package com.role.privilege.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.role.privilege.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<Long,UserEntity>{

}
