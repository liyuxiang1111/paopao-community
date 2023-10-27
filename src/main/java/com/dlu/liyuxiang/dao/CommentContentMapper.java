package com.dlu.liyuxiang.dao;

import com.dlu.liyuxiang.pojo.CommentContent;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentContentMapper {


    int deleteByPrimaryKey(Long id);

    int insert(CommentContent record);

    int insertSelective(CommentContent record);



    CommentContent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommentContent record);

    int updateByPrimaryKey(CommentContent record);
}