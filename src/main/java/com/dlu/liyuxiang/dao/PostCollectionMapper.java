package com.dlu.liyuxiang.dao;

import com.dlu.liyuxiang.pojo.PostCollection;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCollectionMapper {

    int deleteByPrimaryKey(Long id);

    int insert(PostCollection record);

    int insertSelective(PostCollection record);


    PostCollection selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(PostCollection record);

    int updateByPrimaryKey(PostCollection record);
}