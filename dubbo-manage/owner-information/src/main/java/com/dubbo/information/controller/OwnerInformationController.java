package com.dubbo.information.controller;

import com.dubbo.information.domain.OwnerInformation;
import com.dubbo.information.service.OwnerInformationService;
import org.springframework.web.bind.annotation.GetMapping;
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

    /**
     * 查询业主成员
     * @param ownerId 根据业主的ID查询
     * @return 返回业主的信息与业主成员的信息
     */
    @RequestMapping("/select/{ownerId}")
    public Object selectByOwnerId(@PathVariable int ownerId){

        try {
            return ownerInformationService.selectByPrimaryKey(ownerId);

        }catch (Exception e){
            return "No";
        }

    }

    /**
     * 查询业主车辆信息
     * @param ownerId 根据业主的id查询
     * @return 返回业主的信息与业主车辆的信息
     */
    @GetMapping("/selectCars/{ownerId}")
    public Object selectOwnerCar(@PathVariable int ownerId){
        try {
            return ownerInformationService.selectByOwnerCatList(ownerId);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

}
