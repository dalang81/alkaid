package com.lilianinfo.cloud.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lilianinfo.cloud.bean.UserTest;
import com.lilianinfo.cloud.code.UserTestResponseCode;
import com.lilianinfo.cloud.common.code.ResponseVO;
import com.lilianinfo.cloud.service.IUserTestMgrService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class ApiUserTestMgrController {
	

	@Autowired
	@Qualifier("userTestMgrServiceImpl")
	private IUserTestMgrService userTestMgrService;
	
	/**
	 * 根据ID删除登录信息user表信息
	 * @param userId
	 * @return
	 */
	@RequestMapping(path = "/usertest/delete/{id}", method = RequestMethod.DELETE)
	public ResponseVO deleteUser(@PathVariable(value = "id") String id,@RequestHeader(value = "userId", required = true) Long userId) {
		if(StringUtils.isEmpty(id)){
			return UserTestResponseCode.buildEnumResponseVO(UserTestResponseCode.RESPONSE_CODE_REQ_CANNOT_EMPTY, null);
		}
		
		try {
			userTestMgrService.deleteUserById(id);
			return UserTestResponseCode.buildEnumResponseVO(UserTestResponseCode.RESPONSE_RETURN_CODE_SUCCESS, id);
		} catch (Exception e) {
			return UserTestResponseCode.buildEnumResponseVO(UserTestResponseCode.RESPONSE_CODE_SYSTEM_ERROR, id);
		}
	}
	
	@RequestMapping(path = "/usertest/get/{userName}", method = RequestMethod.GET)
	public ResponseVO getUser(@PathVariable(value = "userName") String userName) {
		Map<String, Object> returnData = null;
		try {
      UserTest user = userTestMgrService.getUserByName(userName);
			if (null != user) {
				returnData = new HashMap<String, Object>();
				returnData.put("user", user);
				return UserTestResponseCode.buildEnumResponseVO(UserTestResponseCode.RESPONSE_CODE_SUCCESS, returnData);
			}
			return UserTestResponseCode.buildEnumResponseVO(UserTestResponseCode.RESPONSE_CODE_SYSTEM_ERROR, null);
		} catch (Exception e) {
			return UserTestResponseCode.buildEnumResponseVO(UserTestResponseCode.RESPONSE_CODE_SYSTEM_ERROR, null);
		}
		
	}
}