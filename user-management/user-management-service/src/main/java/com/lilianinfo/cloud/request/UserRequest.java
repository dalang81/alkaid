/**
 * 
 */
package com.lilianinfo.cloud.request;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 用户注册
 * @author kaka
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserRequest {

	
	
	private String userName;
	
	private String mobileNumber;
	
	@NotEmpty(message="密码不能为空")
	private String password;
	
	private String code;

}
