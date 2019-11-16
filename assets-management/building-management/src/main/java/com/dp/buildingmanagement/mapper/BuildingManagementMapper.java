package com.dp.buildingmanagement.mapper;

import com.dp.buildingmanagement.domain.BuildingManagement;

public interface BuildingManagementMapper {
    int deleteByPrimaryKey(Integer buildId);

    int insert(BuildingManagement record);

    int insertSelective(BuildingManagement record);

    BuildingManagement selectByPrimaryKey(Integer buildId);

    int updateByPrimaryKeySelective(BuildingManagement record);

    int updateByPrimaryKey(BuildingManagement record);
}