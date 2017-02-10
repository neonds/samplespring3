/**
 * Copyright (C) 10 feb. 2017 Guillermo Díaz Solís.
 * Todos los derechos reservados.
 */
package com.guillermods.samplespring3.web.model;

import java.util.Date;

/**
 * @author Guillermo B Díaz Solís
 * @since 10 feb. 2017
 * @version 1.0
 */
public class SampleDto {

  private String sampleName;
  
  private Date sampleDate;

  /**
   * @return the sampleName
   */
  public String getSampleName() {
    return sampleName;
  }

  /**
   * @param sampleName the sampleName to set
   */
  public void setSampleName(String sampleName) {
    this.sampleName = sampleName;
  }

  /**
   * @return the sampleDate
   */
  public Date getSampleDate() {
    return sampleDate;
  }

  /**
   * @param sampleDate the sampleDate to set
   */
  public void setSampleDate(Date sampleDate) {
    this.sampleDate = sampleDate;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "SampleDto [sampleName=" + sampleName + ", sampleDate=" + sampleDate + "]";
  }
  
  
}
