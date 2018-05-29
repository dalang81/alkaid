package com.lilianinfo.cloud.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lilianinfo.cloud.bean.User;
import com.lilianinfo.cloud.dao.UserDao;
import com.lilianinfo.cloud.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

	

	@Override
	public User getUserByName(String userName) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("userName", userName);
		User result = baseMapper.getUserByName(map);
		log.debug("getUserByName   result:[" + result + "] ");
		return result;
	}
	
}
