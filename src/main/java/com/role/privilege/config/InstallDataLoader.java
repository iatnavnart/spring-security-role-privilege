package com.role.privilege.config;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.role.privilege.entity.PrivilegeEntity;
import com.role.privilege.repository.PrivilegeRepository;
import com.role.privilege.repository.RoleRepository;
import com.role.privilege.repository.UserRepository;

public class InstallDataLoader implements ApplicationListener<ContextRefreshedEvent> {

  Boolean alreadySetup = false;
  
  private UserRepository userRepository;
  
  private RoleRepository roleRepository;
  
  private PrivilegeRepository privilegeRepository;
  
  @Autowired
  private PasswordEncoder passwordEncoder;
  
  
  @Override
  @Transactional
  public void onApplicationEvent(ContextRefreshedEvent event) {
    if(alreadySetup)return;
    PrivilegeEntity readPrivilege = cre
    
  }

}
