package com.lilianinfo.cloud.service;

import com.lilianinfo.cloud.bean.User;

public interface IUserMgrService {

	public User getUserByName(String userName) throws Exception;
	
	public boolean deleteUserById(String userId) throws Exception;

}
