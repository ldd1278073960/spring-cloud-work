package com.dubbo.information.controller;

import com.dubbo.information.domain.OwnerInformation;
import com.dubbo.information.service.OwnerInformationService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/owner")
public class OwnerInformationController {

    @Resource
    OwnerInformationService ownerInformationService;

    @RequestMapping("/select/{ownerId}")
    public Object selectByOwnerId(@PathVariable int ownerId){

        try {
            return ownerInformationService.selectByPrimaryKey(ownerId);

        }catch (Exception e){
            return "No";
        }

    }

}
