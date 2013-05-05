package com.chocobean.ha.account.service.dao;

import org.apache.ibatis.annotations.Param;

import com.chocobean.ha.account.entity.UserPo;

/**
 * 
 * @author chris
 * 
 */
public interface AccountDao {

	UserPo getUserById(@Param("uid") int uid);

}
