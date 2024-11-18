package com.lanhuachenyuexi.service.imp;


import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lanhuachenyuexi.common.ErrorCode;
import com.lanhuachenyuexi.constant.CommonConstant;
import com.lanhuachenyuexi.exception.BusinessException;
import com.lanhuachenyuexi.exception.ThrowUtils;
import com.lanhuachenyuexi.mapper.QuestionBankQuestionMapper;
import com.lanhuachenyuexi.model.entity.Question;
import com.lanhuachenyuexi.model.entity.QuestionBankQuestion;
import com.lanhuachenyuexi.model.vo.UserVO;
import com.lanhuachenyuexi.service.QuestionBankQuestionService;
import com.lanhuachenyuexi.service.QuestionService;
import com.lanhuachenyuexi.utils.SqlUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.framework.AopContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Collectors;

/**
 * 题库题目关联服务实现
 *

 */
@Service
@Slf4j
public class QuestionBankQuestionServiceImpl extends ServiceImpl<QuestionBankQuestionMapper, QuestionBankQuestion> implements QuestionBankQuestionService {


}
