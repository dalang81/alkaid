package com.lilianinfo.cloud.service;

import com.lilianinfo.cloud.bean.UserTest;

public interface IUserTestMgrService {

	public UserTest getUserByName(String userName) throws Exception;
	
	public boolean deleteUserById(String userId) throws Exception;

}
