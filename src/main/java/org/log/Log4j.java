package org.log;

import org.apache.log4j.Logger;

/**
 * All < Trace < Debug < Info < Warn < Error < Fatal < OFF
 */
public class Log4j {

  static final Logger LOG = Logger.getLogger(Log4j.class);

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      LOG.info("Hello World! " + i);
    }
  }
}
