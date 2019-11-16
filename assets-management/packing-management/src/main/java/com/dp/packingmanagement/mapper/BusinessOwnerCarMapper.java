package com.dp.packingmanagement.mapper;

import com.dp.packingmanagement.domain.BusinessOwnerCar;

import java.util.List;

public interface BusinessOwnerCarMapper {
    int deleteByPrimaryKey(Integer carId);

    int insert(BusinessOwnerCar record);

    int insertSelective(BusinessOwnerCar record);

    List<BusinessOwnerCar> selectByPrimaryKey(int ownerId);

    int updateByPrimaryKeySelective(BusinessOwnerCar record);

    int updateByPrimaryKey(BusinessOwnerCar record);
}