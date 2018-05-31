package com.lilianinfo.cloud.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import com.lilianinfo.cloud.modules.sys.entity.SysUserTokenEntity;
import org.springframework.stereotype.Repository;

/**
 * 系统用户Token
 * 
 * @author kaka
 *  
 * @date 2017-03-23 15:22:07
 */
@Repository
@Mapper
public interface SysUserTokenDao extends BaseDao<SysUserTokenEntity> {
    
    SysUserTokenEntity queryByUserId(Long userId);

    SysUserTokenEntity queryByToken(String token);
	
}
