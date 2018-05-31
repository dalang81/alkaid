package com.lilianinfo.cloud.modules.job.dao;

import org.apache.ibatis.annotations.Mapper;

import com.lilianinfo.cloud.modules.job.entity.ScheduleJobLogEntity;
import com.lilianinfo.cloud.modules.sys.dao.BaseDao;
import org.springframework.stereotype.Repository;

/**
 * 定时任务日志
 * 
 * @author kaka
 *  
 * @date 2016年12月1日 下午10:30:02
 */
@Repository
@Mapper
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
}
