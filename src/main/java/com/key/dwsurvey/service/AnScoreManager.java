package com.key.dwsurvey.service;

import java.util.List;

import com.key.common.service.BaseService;
import com.key.dwsurvey.entity.AnScore;
import com.key.dwsurvey.entity.Question;

/**
 * 评分题
 * yipinhong
 *
 *
 * http://dwsurvey.net
 */
public interface AnScoreManager extends BaseService<AnScore, String>{
	public List<AnScore>  findAnswer(String belongAnswerId,String quId);

	public void findGroupStats(Question question);
}
