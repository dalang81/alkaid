package com.lilianinfo.cloud.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import com.lilianinfo.cloud.modules.sys.entity.SysMenuEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 菜单管理
 * 
 * @author kaka
 *  
 * @date 2016年9月18日 上午9:33:01
 */
@Repository
@Mapper
public interface SysMenuDao extends BaseDao<SysMenuEntity> {
	
	/**
	 * 根据父菜单，查询子菜单
	 * @param parentId 父菜单ID
	 */
	List<SysMenuEntity> queryListParentId(Long parentId);
	
	/**
	 * 获取不包含按钮的菜单列表
	 */
	List<SysMenuEntity> queryNotButtonList();
	
	/**
	 * 查询用户的权限列表
	 */
	List<SysMenuEntity> queryUserList(Long userId);
}
