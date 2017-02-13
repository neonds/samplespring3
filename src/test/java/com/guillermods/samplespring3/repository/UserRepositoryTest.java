/**
 * Copyright (C) 11 feb. 2017 Guillermo Díaz Solís.
 * Todos los derechos reservados.
 */
package com.guillermods.samplespring3.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.guillermods.samplespring3.RootConfig;
import com.guillermods.samplespring3.domain.User;

/**
 * @author Guillermo B Díaz Solís
 * @since 11 feb. 2017
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class,
    loader = AnnotationConfigContextLoader.class)
@ActiveProfiles("dev")
public class UserRepositoryTest {

  @Autowired
  private UserDetailsService userdetailService;

  /**
   * Test method for {@link com.guillermods.samplespring3.repository.UserRepository#findUserByUsername(java.lang.String)}.
   */
  @Test
  public void testFindUserByUsername() {
    User user =  (User) userdetailService.loadUserByUsername("admin");
    System.out.println(user);
  }

}
