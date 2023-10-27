package com.dlu.liyuxiang.dao;

import com.dlu.liyuxiang.pojo.PostContent;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostContentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(PostContent record);

    int insertSelective(PostContent record);


    PostContent selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(PostContent record);

    int updateByPrimaryKey(PostContent record);
}