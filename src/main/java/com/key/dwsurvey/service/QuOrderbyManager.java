package com.key.dwsurvey.service;

import java.util.List;

import com.key.common.service.BaseService;
import com.key.dwsurvey.entity.QuOrderby;

/**
 * 排序题
 * yipinhong
 *
 *
 * http://dwsurvey.net
 */
public interface QuOrderbyManager extends BaseService<QuOrderby, String>{

	public List<QuOrderby> findByQuId(String id);
	
	public QuOrderby upOptionName(String quId,String quItemId, String optionName);

	public List<QuOrderby> saveManyOptions(String quId,List<QuOrderby> quOrderbys);

	public void ajaxDelete(String quItemId);

	public void saveAttr(String quItemId);
}
