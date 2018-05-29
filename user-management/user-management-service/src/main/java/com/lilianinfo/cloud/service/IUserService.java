package com.lilianinfo.cloud.service;

import com.baomidou.mybatisplus.service.IService;
import com.lilianinfo.cloud.bean.User;


public interface IUserService extends IService<User> {
	
	public User getUserByName(String userName);
	
}
