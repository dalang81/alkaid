package com.lilianinfo.cloud.modules.oss.dao;

import org.apache.ibatis.annotations.Mapper;

import com.lilianinfo.cloud.modules.oss.entity.SysOssEntity;
import com.lilianinfo.cloud.modules.sys.dao.BaseDao;
import org.springframework.stereotype.Repository;

/**
 * 文件上传
 * 
 * @author kaka
 *  
 * @date 2017-03-25 12:13:26
 */
@Repository
@Mapper
public interface SysOssDao extends BaseDao<SysOssEntity> {
	
}
