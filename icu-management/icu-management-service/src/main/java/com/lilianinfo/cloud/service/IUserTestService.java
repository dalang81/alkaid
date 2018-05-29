package com.lilianinfo.cloud.service;

import com.baomidou.mybatisplus.service.IService;
import com.lilianinfo.cloud.bean.UserTest;

public interface IUserTestService extends IService<UserTest> {

  public UserTest getUserByName(String userName);

}
