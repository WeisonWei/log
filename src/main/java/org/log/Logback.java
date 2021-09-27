package org.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logback {

  static final Logger LOG = LoggerFactory.getLogger(Logback.class);

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      LOG.info("Hello World! " + i);
    }
  }
}
