package com.dlu.liyuxiang.dao;

import com.dlu.liyuxiang.pojo.PostAttachmentBill;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostAttachmentBillMapper {

    int deleteByPrimaryKey(Long id);

    int insert(PostAttachmentBill record);

    int insertSelective(PostAttachmentBill record);


    PostAttachmentBill selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(PostAttachmentBill record);

    int updateByPrimaryKey(PostAttachmentBill record);
}