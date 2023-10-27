package com.dlu.liyuxiang.dao;

import com.dlu.liyuxiang.pojo.PostStar;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostStarMapper {

    int deleteByPrimaryKey(Long id);

    int insert(PostStar record);

    int insertSelective(PostStar record);

    PostStar selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PostStar record);

    int updateByPrimaryKey(PostStar record);
}