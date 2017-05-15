package com.qph.app.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qph.app.domain.pojo.SysUser;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SysUserService {

	@Autowired
	private UserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(SysUserService.class);
	
	@Test
	public void testGetData(){
		Pageable page = new PageRequest(0, 15);
		Page<SysUser> page1 = userService.findAll(page);
		logger.info("page1==>"+page1.getContent().size());
		
		SysUser user = userService.getOne(Long.valueOf(1));
		logger.info("user==>"+user.getUsername());
	}
	
}
