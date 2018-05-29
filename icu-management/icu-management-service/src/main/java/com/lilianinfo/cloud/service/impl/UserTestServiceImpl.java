package com.lilianinfo.cloud.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lilianinfo.cloud.bean.UserTest;
import com.lilianinfo.cloud.dao.UserTestDao;
import com.lilianinfo.cloud.service.IUserTestService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserTestServiceImpl extends ServiceImpl<UserTestDao, UserTest> implements IUserTestService {

	

	@Override
	public UserTest getUserByName(String userName) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("userName", userName);
		UserTest result = baseMapper.getUserByName(map);
		log.debug("getUserByName   result:[" + result + "] ");
		return result;
	}
	
}
