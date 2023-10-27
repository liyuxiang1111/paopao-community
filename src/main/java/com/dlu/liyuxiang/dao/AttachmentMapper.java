package com.dlu.liyuxiang.dao;

import com.dlu.liyuxiang.pojo.Attachment;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachmentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Attachment record);

    int insertSelective(Attachment record);

    Attachment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Attachment record);

    int updateByPrimaryKey(Attachment record);
}