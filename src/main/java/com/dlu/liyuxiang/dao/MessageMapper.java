package com.dlu.liyuxiang.dao;

import com.dlu.liyuxiang.pojo.Message;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Message record);

    int insertSelective(Message record);


    Message selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}