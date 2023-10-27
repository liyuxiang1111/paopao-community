package com.dlu.liyuxiang.dao;

import com.dlu.liyuxiang.pojo.Comment;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentMapper {


    int deleteByPrimaryKey(Long id);

    int insert(Comment record);

    int insertSelective(Comment record);


    Comment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}