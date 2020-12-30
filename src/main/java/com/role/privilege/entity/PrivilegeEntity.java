package com.role.privilege.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="privilege")
public class PrivilegeEntity {

  @Column(name = "id")
  private Long id;

  @Column(name = "name")
  private String name;

  @ManyToMany(mappedBy = "privileges")
  private Set<RoleEntity> roles;
}
