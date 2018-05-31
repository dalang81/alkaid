package com.lilianinfo.cloud.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import com.lilianinfo.cloud.modules.sys.entity.SysRoleEntity;
import org.springframework.stereotype.Repository;

/**
 * 角色管理
 * 
 * @author kaka
 *  
 * @date 2016年9月18日 上午9:33:33
 */
@Repository
@Mapper
public interface SysRoleDao extends BaseDao<SysRoleEntity> {
	

}
