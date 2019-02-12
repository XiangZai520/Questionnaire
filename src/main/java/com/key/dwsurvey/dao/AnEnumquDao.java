package com.key.dwsurvey.dao;

import com.key.common.dao.BaseDao;
import com.key.dwsurvey.entity.Question;
import com.key.dwsurvey.entity.AnEnumqu;

/**
 * 枚举题 interface
 * yipinhong
 *
 *
 * http://dwsurvey.net
 *
 */
public interface AnEnumquDao extends BaseDao<AnEnumqu, String>{

	public void findGroupStats(Question question);

}
