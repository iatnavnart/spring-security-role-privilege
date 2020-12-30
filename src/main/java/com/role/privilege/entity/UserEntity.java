package com.role.privilege.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class UserEntity {
  
  @Column(name = "id")
  private Long id;
  
  @Column(name="first_name")
  private String firstName;
  
  @Column(name="last_name")
  private String lastName;
  
  @Column(name="email")
  private String email;
  
  @Column(name="password")
  private String password;
  
  @Column(name="enabled")
  private Boolean enabled;
  
  @Column(name="token_expired")
  private Boolean tokenExpired;
  
  @ManyToMany
  @JoinTable(name="users_roles", joinColumns = @JoinColumn(
      name="user_id", referencedColumnName = "id"),
      inverseJoinColumns = @JoinColumn(
          name="role_id", referencedColumnName = "id"
          ))
   private Set<RoleEntity> roles;
   
}
