package com.dubbo.manage.controller;

import com.dubbo.api.service.OwnerMemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/owner")
public class OwnerMemberController {

    @Resource
    OwnerMemberService ownerMemberService;

    @RequestMapping("/select")
    public Object selectById(int memberId){
        return ownerMemberService.selectById(memberId);
    }
}
