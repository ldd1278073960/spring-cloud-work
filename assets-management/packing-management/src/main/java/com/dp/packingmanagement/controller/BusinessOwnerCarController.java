package com.dp.packingmanagement.controller;


import com.dp.packingmanagement.service.BusinessOwnerCarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author dongpo~
 */
@RestController
@RequestMapping("/ownerCarS")
public class BusinessOwnerCarController {


    @Resource
    BusinessOwnerCarService businessOwnerCarService;


    @GetMapping("/selectId/{ownerId}")
    public Object selectByPrimaryKey(@PathVariable("ownerId") int ownerId) {
        try {
            return businessOwnerCarService.selectByPrimaryKey(ownerId);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

}
