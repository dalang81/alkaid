package com.lilianinfo.cloud.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import com.lilianinfo.cloud.modules.sys.entity.SysRoleMenuEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 角色与菜单对应关系
 * 
 * @author kaka
 *  
 * @date 2016年9月18日 上午9:33:46
 */
@Repository
@Mapper
public interface SysRoleMenuDao extends BaseDao<SysRoleMenuEntity> {
	
	/**
	 * 根据角色ID，获取菜单ID列表
	 */
	List<Long> queryMenuIdList(Long roleId);
}
