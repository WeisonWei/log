package org.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import org.apache.log4j.Logger;

/**
 * use Log4j Slj4j implementation
 */
public class Log4jSlj4j {

  //static final Logger LOG = Logger.getLogger(Log4jSlj4j.class);
  static final Logger LOG = LoggerFactory.getLogger(Log4jSlj4j.class);

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      LOG.info("Hello World! " + i);
    }
  }
}
