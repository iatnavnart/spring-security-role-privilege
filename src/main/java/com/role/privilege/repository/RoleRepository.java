package com.role.privilege.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.role.privilege.entity.RoleEntity;

@Repository
public interface RoleRepository extends JpaRepository<Long, RoleEntity>{

}
