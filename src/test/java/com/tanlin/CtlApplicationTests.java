package com.tanlin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CtlApplicationTests {

	Logger logger = LoggerFactory.getLogger(CtlApplication.class);

	@Test
	public void contextLoads() {
		logger.trace("-------------trace");
		logger.debug("-------------debug");
		//springboot的默认打印级别是info
		logger.info("-------------info");
		logger.warn("-------------warn");
		logger.error("-------------error");
	}

}
