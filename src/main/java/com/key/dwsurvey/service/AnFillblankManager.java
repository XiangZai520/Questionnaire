package com.key.dwsurvey.service;

import com.key.common.plugs.page.Page;
import com.key.common.service.BaseService;
import com.key.dwsurvey.entity.AnFillblank;
import com.key.dwsurvey.entity.Question;
import org.hibernate.criterion.Criterion;

/**
 * 填空题
 * yipinhong
 *
 *
 * http://dwsurvey.net
 */
public interface AnFillblankManager extends BaseService<AnFillblank, String>{
	public AnFillblank findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);

	Page<AnFillblank> findPage(Page<AnFillblank> page, String quId);
}
