package com.lilianinfo.cloud.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import com.lilianinfo.cloud.modules.sys.entity.SysRoleDeptEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 角色与部门对应关系
 * 
 * @author kaka
 *  
 * @date 2017年6月21日 23:33:46
 */
@Repository
@Mapper
public interface SysRoleDeptDao extends BaseDao<SysRoleDeptEntity> {
	
	/**
	 * 根据角色ID，获取部门ID列表
	 */
	List<Long> queryDeptIdList(Long roleId);
}
