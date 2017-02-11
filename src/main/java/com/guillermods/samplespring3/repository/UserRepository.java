/**
 * Copyright (C) 10 feb. 2017 Guillermo Díaz Solís.
 * Todos los derechos reservados.
 */
package com.guillermods.samplespring3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.guillermods.samplespring3.domain.User;


/**
 * 
 * @author Guillermo B Díaz Solís
 * @since 11 feb. 2017
 * @version 1.0
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  public User findUserByUsername(String userName);
}
