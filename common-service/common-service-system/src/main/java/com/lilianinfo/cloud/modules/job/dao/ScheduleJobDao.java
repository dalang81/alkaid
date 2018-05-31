package com.lilianinfo.cloud.modules.job.dao;

import org.apache.ibatis.annotations.Mapper;

import com.lilianinfo.cloud.modules.job.entity.ScheduleJobEntity;
import com.lilianinfo.cloud.modules.sys.dao.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 定时任务
 * 
 * @author kaka
 *  
 * @date 2016年12月1日 下午10:29:57
 */
@Repository
@Mapper
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
