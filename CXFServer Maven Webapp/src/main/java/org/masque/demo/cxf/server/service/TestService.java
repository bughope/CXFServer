package org.masque.demo.cxf.server.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.masque.demo.cxf.server.domain.User;
@WebService
public interface TestService {

	public List<User> getUserList(@WebParam(name="name")String name);
}
