/**
 * 
 */
package com.lilianinfo.cloud.request;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户注册
 * @author kaka
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserTestRequest {

	
	
	private String userName;
	
	private String mobileNumber;
	
	@NotEmpty(message="密码不能为空")
	private String password;
	
	private String code;

}
