package com.dp.packingmanagement.service.impl;

import com.dp.packingmanagement.domain.BusinessOwnerCar;
import com.dp.packingmanagement.mapper.BusinessOwnerCarMapper;
import com.dp.packingmanagement.service.BusinessOwnerCarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class BusinessOwnerCarServiceImpl implements BusinessOwnerCarService {


    @Resource
    BusinessOwnerCarMapper businessOwnerCarMapper;

    @Override
    public List<BusinessOwnerCar> selectByPrimaryKey(int ownerId) {
        return businessOwnerCarMapper.selectByPrimaryKey(ownerId);
    }
}
