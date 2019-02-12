package com.key.dwsurvey.dao;

import com.key.common.dao.BaseDao;
import com.key.dwsurvey.entity.Question;
import com.key.dwsurvey.entity.AnChenCheckbox;

/**
 * 矩陈多选题数据 interface
 * yipinhong
 *
 *
 * http://dwsurvey.net
 *
 */
public interface AnChenCheckboxDao extends BaseDao<AnChenCheckbox, String>{

	public void findGroupStats(Question question);

}
