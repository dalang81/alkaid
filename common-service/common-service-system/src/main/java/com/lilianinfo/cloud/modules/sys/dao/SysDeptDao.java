package com.lilianinfo.cloud.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import com.lilianinfo.cloud.modules.sys.entity.SysDeptEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 部门管理
 * 
 * @author kaka
 *  
 * @date 2017-06-20 15:23:47
 */
@Repository
@Mapper
public interface SysDeptDao extends BaseDao<SysDeptEntity> {

    /**
     * 查询子部门ID列表
     * @param parentId  上级部门ID
     */
    List<Long> queryDetpIdList(Long parentId);
}
