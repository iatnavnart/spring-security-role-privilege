package com.role.privilege.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.role.privilege.entity.PrivilegeEntity;

@Repository
public interface PrivilegeRepository extends JpaRepository<Long,PrivilegeEntity>{

}
