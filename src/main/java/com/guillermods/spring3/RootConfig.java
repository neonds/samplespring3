/**
 * Copyright (C) 10 feb. 2017 Guillermo Díaz Solís.
 * Todos los derechos reservados.
 */
package com.guillermods.spring3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author Guillermo B Díaz Solís
 * @since 10 feb. 2017
 * @version 1.0
 */
@Configuration
@ComponentScan(excludeFilters = {
    @Filter( type = FilterType.ANNOTATION, value = Controller.class)
})
public class RootConfig {

}
