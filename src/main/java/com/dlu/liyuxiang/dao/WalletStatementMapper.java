package com.dlu.liyuxiang.dao;

import com.dlu.liyuxiang.pojo.WalletStatement;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletStatementMapper {

    int deleteByPrimaryKey(Long id);

    int insert(WalletStatement record);

    int insertSelective(WalletStatement record);

    WalletStatement selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WalletStatement record);

    int updateByPrimaryKey(WalletStatement record);
}