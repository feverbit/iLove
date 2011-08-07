package com.ilove.test.service;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.ilove.mapper.HomeMapper;
import com.ilove.meta.Home;
import com.ilove.test.AbstractTestCase;

public class TestIloveService extends AbstractTestCase {
	
	private static final Logger logger = Logger.getLogger(TestIloveService.class);
	
	
	@Autowired HomeMapper homeMaper;
	
	public void testHome() {
		Home home = new Home();
		String coverUrl = "http://imgrc.ph.126.net/QPJARLK0HdDDGEHq2IJXng==/4227754150194074041.jpg";
		String href= "http://photo.163.com/9792830@qq.com/pp/5514216.html";
		home.setCoverUrl1(coverUrl);
		home.setCoverUrl2(coverUrl);
		home.setCoverUrl3(coverUrl);
		home.setHref1(href);
		home.setHref2(href);
		home.setHref3(href);
		home.setLastUpdateTime(new Date().getTime());
		int result= homeMaper.addNewHome(home);
		logger.info("addNewHome result is : " + result);
	}

}
