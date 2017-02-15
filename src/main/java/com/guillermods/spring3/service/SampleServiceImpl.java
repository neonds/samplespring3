/**
 * Copyright (C) 10 feb. 2017 Guillermo Díaz Solís.
 * Todos los derechos reservados.
 */
package com.guillermods.spring3.service;

import org.springframework.stereotype.Service;

/**
 * @author Guillermo B Díaz Solís
 * @since 10 feb. 2017
 * @version 1.0
 */
@Service
public class SampleServiceImpl implements SampleService {

  /* (non-Javadoc)
   * @see com.guillermods.samplespring3.service.SampleService#sayHello()
   */
  @Override
  public String sayHello() {
    return "Hellow, I'm " + this.getClass().getCanonicalName();
  }

}
