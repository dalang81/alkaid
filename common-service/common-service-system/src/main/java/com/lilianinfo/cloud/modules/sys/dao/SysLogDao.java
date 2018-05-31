package com.lilianinfo.cloud.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import com.lilianinfo.cloud.modules.sys.entity.SysLogEntity;
import org.springframework.stereotype.Repository;

/**
 * 系统日志
 * 
 * @author kaka
 *  
 * @date 2017-03-08 10:40:56
 */
@Repository
@Mapper
public interface SysLogDao extends BaseDao<SysLogEntity> {
	
}
