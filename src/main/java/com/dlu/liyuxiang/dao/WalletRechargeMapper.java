package com.dlu.liyuxiang.dao;

import com.dlu.liyuxiang.pojo.WalletRecharge;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRechargeMapper {
    int deleteByPrimaryKey(Long id);
    int insert(WalletRecharge record);
    int insertSelective(WalletRecharge record);
    WalletRecharge selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WalletRecharge record);

    int updateByPrimaryKey(WalletRecharge record);
}