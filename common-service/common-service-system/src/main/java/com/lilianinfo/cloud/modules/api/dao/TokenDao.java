package com.lilianinfo.cloud.modules.api.dao;

import com.lilianinfo.cloud.modules.api.entity.TokenEntity;
import com.lilianinfo.cloud.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 用户Token
 * 
 * @author kaka
 *  
 * @date 2017-03-23 15:22:07
 */
@Repository
@Mapper
public interface TokenDao extends BaseDao<TokenEntity> {
    
    TokenEntity queryByUserId(Long userId);

    TokenEntity queryByToken(String token);
	
}
