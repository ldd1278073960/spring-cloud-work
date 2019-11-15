package com.dubbo.information.service.impl;

import com.dubbo.api.service.OwnerMemberService;
import com.dubbo.information.domain.OwnerInformation;
import com.dubbo.information.domain.vo.OwnerInformationVo;
import com.dubbo.information.mapper.OwnerInformationMapper;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OwnerInformationServiceImpl {

    @Resource
    OwnerInformationMapper ownerInformationMapper;

    @Reference
    OwnerMemberService ownerMemberService;

    public OwnerInformation selectByOwnerId(int ownerId){
        return ownerInformationMapper.selectByPrimaryKey(ownerId);
    }

}
