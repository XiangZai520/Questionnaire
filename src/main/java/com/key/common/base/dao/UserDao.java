package com.key.common.base.dao;

import com.key.common.base.entity.User;
import com.key.common.dao.BaseDao;


/**
 * yipinhong
 *
 *
 * http://dwsurvey.net
 */
public interface UserDao extends BaseDao<User, String> {

	public void resetUserGroup(String groupId);
	
}
