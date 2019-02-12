package com.key.dwsurvey.service;

import com.key.dwsurvey.entity.SurveyStyle;

/**
 * 问卷样式
 * yipinhong
 *
 *
 * http://dwsurvey.net
 */
public interface SurveyStyleManager  {

	public SurveyStyle get(String id) ;
	
	public SurveyStyle getBySurveyId(String surveyId) ;
	
	public void save(SurveyStyle surveyStyle) ;
}
