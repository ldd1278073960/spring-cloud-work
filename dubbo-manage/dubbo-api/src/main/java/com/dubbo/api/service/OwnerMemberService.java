package com.dubbo.api.service;

import com.dubbo.api.domain.OwnerMemberVo;

import java.util.List;

public interface OwnerMemberService {

    List<OwnerMemberVo> selectById(int memberId);

}
