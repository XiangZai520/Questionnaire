package com.key.dwsurvey.dao;

import com.key.common.dao.BaseDao;
import com.key.dwsurvey.entity.Question;
import com.key.dwsurvey.entity.AnChenRadio;

/**
 * 矩陈单选题数据 interface
 * yipinhong
 *
 *
 * http://dwsurvey.net
 *
 */
public interface AnChenRadioDao extends BaseDao<AnChenRadio, String>{

	public void findGroupStats(Question question);

}
