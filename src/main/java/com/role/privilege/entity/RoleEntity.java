package com.role.privilege.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="role")
public class RoleEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="id")
  private Long id;
  
  @Column(name =  "name")
  private String name;
  
  @ManyToMany
  @JoinTable(name="roles_privileges", joinColumns = @JoinColumn(
      name="role_id", 
      referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(
          name="privilege_id", 
          referencedColumnName = "id"))
  private Set<UserEntity> users;
}
