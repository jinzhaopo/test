
package com.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.dao.testDao;
import com.test.entry.SaleBean;

@Service
public class TestService {
	@Resource
	private testDao dao;
	
	public SaleBean service(String name){
		return dao.findByName(name);
	}
}

