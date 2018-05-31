package com.lilianinfo.cloud.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import com.lilianinfo.cloud.modules.sys.entity.SysUserRoleEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户与角色对应关系
 * 
 * @author kaka
 *  
 * @date 2016年9月18日 上午9:34:46
 */
@Repository
@Mapper
public interface SysUserRoleDao extends BaseDao<SysUserRoleEntity> {
	
	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);
}
