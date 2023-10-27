package com.dlu.liyuxiang.dao;

import com.dlu.liyuxiang.pojo.Captcha;
import org.springframework.stereotype.Repository;

@Repository
public interface CaptchaMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Captcha record);

    int insertSelective(Captcha record);

    Captcha selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Captcha record);

    int updateByPrimaryKey(Captcha record);
}