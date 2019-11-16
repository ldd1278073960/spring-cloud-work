package com.dubbo.information.service.impl;

import com.dubbo.api.domain.OwnerMemberVo;
import com.dubbo.api.service.OwnerMemberService;
import com.dubbo.information.domain.OwnerInformation;
import com.dubbo.information.domain.dto.BusinessOwnerCarDto;
import com.dubbo.information.domain.vo.OwnerInformationOwnerCarVo;
import com.dubbo.information.domain.vo.OwnerInformationVo;
import com.dubbo.information.mapper.OwnerInformationMapper;
import com.dubbo.information.service.BusinessOwnerService;
import com.dubbo.information.service.OwnerInformationService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class OwnerInformationServiceImpl implements OwnerInformationService {

    @Resource
    OwnerInformationMapper ownerInformationMapper;

    /**
     * 业主的成员service模块
     */
    @Reference
    private OwnerMemberService ownerMemberService;

    @Override
    public OwnerInformationVo selectByPrimaryKey(int ownerId) {
        OwnerInformation ownerInformation = ownerInformationMapper.selectByPrimaryKey(ownerId);
        //查询业主成员
        List<OwnerMemberVo> ownerMemberVos = ownerMemberService.selectById(ownerInformation.getOwnerId());
        OwnerInformationVo ownerInformationVo = new OwnerInformationVo();
        ownerInformationVo.setOwnerInformation(ownerInformation);
        ownerInformationVo.setOwnerMemberVos(ownerMemberVos);
        return ownerInformationVo;
    }


    /**
     * 查询业主的车辆信息
     */
    @Resource
    BusinessOwnerService businessOwnerService;


    @Override
    public OwnerInformationOwnerCarVo selectByOwnerCatList(int ownerId) {
        OwnerInformation ownerInformation = ownerInformationMapper.selectByPrimaryKey(ownerId);

        //根据获取到的业主Id查询业主的车辆信息
        List<BusinessOwnerCarDto> businessOwnerCarDtos = businessOwnerService.selectByPrimaryKey(ownerInformation.getOwnerId());

        OwnerInformationOwnerCarVo ownerInformationOwnerCarVo = new OwnerInformationOwnerCarVo();
        ownerInformationOwnerCarVo.setBusinessOwnerCarDtoList(businessOwnerCarDtos);
        ownerInformationOwnerCarVo.setOwnerInformation(ownerInformation);
        return ownerInformationOwnerCarVo;
    }

}
