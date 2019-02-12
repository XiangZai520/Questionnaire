package com.key.dwsurvey.service;

import java.util.List;

import com.key.dwsurvey.entity.QuestionLogic;

/**
 * 题逻辑
 * yipinhong
 *
 *
 * http://dwsurvey.net
 */
public interface QuestionLogicManager {

	List<QuestionLogic> findByCkQuId(String quId);

}
