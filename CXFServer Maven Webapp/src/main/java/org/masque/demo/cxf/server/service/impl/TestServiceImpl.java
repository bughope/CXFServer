package org.masque.demo.cxf.server.service.impl;

import java.util.Arrays;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.masque.demo.cxf.server.domain.User;
import org.masque.demo.cxf.server.service.TestService;

@WebService
public class TestServiceImpl implements TestService {

	List<User> list = Arrays.asList(new User(1,"admin","admin"),
									new User(2,"root","root"),
									new User(3,"test","test"),
									new User(4,"demo","demo"),
									new User());
	
	public List<User> getUserList(@WebParam(name="name")String name) {
		for(User u:list){
			u.setName(name);
		}
		return list;
	}
	
}
