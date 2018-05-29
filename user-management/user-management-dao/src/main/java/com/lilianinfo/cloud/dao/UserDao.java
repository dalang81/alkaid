package com.lilianinfo.cloud.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.lilianinfo.cloud.bean.User;

import java.util.Map;

public interface UserDao extends BaseMapper<User> {
	
	public User getUserByName(Map map);
	
}