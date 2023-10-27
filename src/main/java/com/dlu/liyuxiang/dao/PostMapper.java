package com.dlu.liyuxiang.dao;

import com.dlu.liyuxiang.pojo.Post;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Post record);

    int insertSelective(Post record);


    Post selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
}