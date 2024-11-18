package com.lanhuachenyuexi.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lanhuachenyuexi.common.BaseResponse;
import com.lanhuachenyuexi.common.ErrorCode;
import com.lanhuachenyuexi.common.ResultUtils;
import com.lanhuachenyuexi.exception.ThrowUtils;
import com.lanhuachenyuexi.model.dto.qustion.QuestionQueryRequest;
import com.lanhuachenyuexi.model.entity.Question;
import com.lanhuachenyuexi.model.vo.QuestionVO;
import com.lanhuachenyuexi.service.QuestionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 题目接口
 *

 */
@RestController
@RequestMapping("/question")
@Slf4j
public class QuestionController {

    @Resource
    private QuestionService questionService;

    @PostMapping("/search/page/vo")
    public BaseResponse<Page<QuestionVO>> searchQuestionVOByPage(@RequestBody QuestionQueryRequest questionQueryRequest,
                                                                 HttpServletRequest request) {
        long size = questionQueryRequest.getPageSize();
        // 限制爬虫
        ThrowUtils.throwIf(size > 200, ErrorCode.PARAMS_ERROR);
        // todo 取消注释开启 ES（须先配置 ES）
        // 查询 ES
         Page<Question> questionPage = questionService.searchFromEs(questionQueryRequest);
        // 查询数据库（作为没有 ES 的降级方案）
//        Page<Question> questionPage = questionService.listQuestionByPage(questionQueryRequest);
        return ResultUtils.success(questionService.getQuestionVOPage(questionPage, request));
    }


}
