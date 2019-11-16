package com.dubbo.manage.service.impl;

import com.dubbo.api.domain.OwnerMemberVo;
import com.dubbo.api.service.OwnerMemberService;
import com.dubbo.manage.mapper.OwnerMemberMapper;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class OwnerMemberServiceImpl implements OwnerMemberService {

    @Resource
    OwnerMemberMapper ownerMemberMapper;

    @Override
    public List<OwnerMemberVo> selectById(int memberId) {
        return ownerMemberMapper.selectByPrimaryKey(memberId);
    }
}
