package com.k4t2.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.k4t2.BizCordApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BizCordApplication.class)
@WebAppConfiguration
public class BizCordApplicationTests {

	@Test
	public void contextLoads() {
	}

}
