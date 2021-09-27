package org.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

/**
 * 配置文件的格式：log2j配置文件可以是properties、xml格式的，也可以是json格式的。
 * 配置文件的位置：log4j2默认会在classpath目录下寻找log4j2.xml、log4j.json、log4j.jsn等名称的文件。
 * 系统选择配置文件的优先级(从先到后)如下：
 * 　　(1).classpath下的名为log4j2-test.json 或者log4j2-test.jsn的文件.
 * 　　(2).classpath下的名为log4j2-test.xml的文件.
 * 　　(3).classpath下名为log4j2.json 或者log4j2.jsn的文件.
 * 　　(4).classpath下名为log4j2.xml的文件.
 * 　　我们一般默认使用log4j2.xml进行命名。
 */
public class Log4j2Slj4j {

  //static final Logger LOG = LogManager.getLogger(Log4j2Slj4j.class);
  static final Logger LOG = LoggerFactory.getLogger(Log4j2Slj4j.class);

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      LOG.info("Hello World! " + i);
    }
  }
}
