package com.dubbo.manage.mapper;

import com.dubbo.api.domain.OwnerMemberVo;
import com.dubbo.manage.domain.OwnerMember;

import java.util.List;

public interface OwnerMemberMapper {
    int deleteByPrimaryKey(Integer memberId);

    int insert(OwnerMember record);

    int insertSelective(OwnerMember record);

    List<OwnerMemberVo> selectByPrimaryKey(int ownerId);


    int updateByPrimaryKeySelective(OwnerMember record);

    int updateByPrimaryKey(OwnerMember record);
}