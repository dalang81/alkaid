/**
 * 
 */
package com.lilianinfo.cloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lilianinfo.cloud.bean.UserTest;
import com.lilianinfo.cloud.service.IUserTestMgrService;
import com.lilianinfo.cloud.service.IUserTestService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserTestMgrServiceImpl implements IUserTestMgrService {

  @Autowired
  @Qualifier("userTestServiceImpl")
  private IUserTestService userService;

  @Override
  public UserTest getUserByName(String userName) throws Exception {
    return userService.getUserByName(userName);
  }

  @Transactional
  @Override
  public boolean deleteUserById(String userId) throws Exception {
    boolean flag = userService.deleteById(userId);
    return flag;
  }
}
