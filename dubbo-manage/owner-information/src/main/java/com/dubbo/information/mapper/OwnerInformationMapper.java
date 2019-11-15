package com.dubbo.information.mapper;

import com.dubbo.information.domain.OwnerInformation;

public interface OwnerInformationMapper {
    int deleteByPrimaryKey(Integer ownerId);

    int insert(OwnerInformation record);

    int insertSelective(OwnerInformation record);

    OwnerInformation selectByPrimaryKey(int ownerId);

    int updateByPrimaryKeySelective(OwnerInformation record);

    int updateByPrimaryKey(OwnerInformation record);
}