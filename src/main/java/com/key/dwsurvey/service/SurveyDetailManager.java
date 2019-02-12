package com.key.dwsurvey.service;

import com.key.common.service.BaseService;
import com.key.dwsurvey.entity.SurveyDetail;

/**
 * 问卷评情
 * yipinhong
 *
 *
 * http://dwsurvey.net
 */
public interface SurveyDetailManager extends BaseService<SurveyDetail, String>{
	
	public SurveyDetail getBySurveyId(String surveyId);
	
}
