package com.guillermods.samplespring3.web.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.guillermods.samplespring3.service.SampleService;
import com.guillermods.samplespring3.web.model.SampleDto;

/**
 * @author Guillermo B Díaz Solís
 * @since 10 feb. 2017
 * @version 1.0
 */
@Controller
@RequestMapping(value = {"home", "/"})
public class HomeController {

 @Autowired
 private SampleService sampleService;
  
  @RequestMapping(method = RequestMethod.GET)
  public String index(Model model){
   model.addAttribute("serviceMessage", sampleService.sayHello());
    
    return "home/index";
  }
  
  @RequestMapping(method = RequestMethod.GET, value = "ping" )
  public ResponseEntity<SampleDto> ping(){
    SampleDto sample = new SampleDto();
    
    sample.setSampleName("Example");
    sample.setSampleDate(new Date());
    
    return new ResponseEntity<SampleDto>(sample, HttpStatus.OK);
  }
}
