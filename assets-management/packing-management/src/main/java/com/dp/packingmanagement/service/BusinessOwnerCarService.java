package com.dp.packingmanagement.service;

import com.dp.packingmanagement.domain.BusinessOwnerCar;

import java.util.List;

public interface BusinessOwnerCarService {

    List<BusinessOwnerCar> selectByPrimaryKey(int ownerId);


}
