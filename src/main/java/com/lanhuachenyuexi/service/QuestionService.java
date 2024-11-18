package com.lanhuachenyuexi.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lanhuachenyuexi.model.dto.qustion.QuestionQueryRequest;
import com.lanhuachenyuexi.model.entity.Question;
import com.lanhuachenyuexi.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

/**
 * 题目服务
 *

 */
public interface QuestionService extends IService<Question> {


    /**
     * 获取查询条件
     *
     * @param questionQueryRequest
     * @return
     */
    QueryWrapper<Question> getQueryWrapper(QuestionQueryRequest questionQueryRequest);

    /**
     * 分页获取题目封装
     *
     * @param questionPage
     * @param request
     * @return
     */
    Page<QuestionVO> getQuestionVOPage(Page<Question> questionPage, HttpServletRequest request);


    /**
     * 从 ES 查询题目
     *
     * @param questionQueryRequest
     * @return
     */
    Page<Question> searchFromEs(QuestionQueryRequest questionQueryRequest);


}
