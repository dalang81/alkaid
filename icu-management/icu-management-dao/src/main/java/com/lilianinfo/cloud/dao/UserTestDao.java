package com.lilianinfo.cloud.dao;

import java.util.Map;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.lilianinfo.cloud.bean.UserTest;

public interface UserTestDao extends BaseMapper<UserTest> {
	
  public UserTest getUserByName(Map map);
	
}