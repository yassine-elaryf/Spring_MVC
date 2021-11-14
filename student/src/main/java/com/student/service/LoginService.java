package com.student.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
public boolean checkValidateUser(String name ,String password) {
	if(name.equals("admin")&&password.equals("12345")) {
		return true;
	}else {
		return false;
	}
}
}
