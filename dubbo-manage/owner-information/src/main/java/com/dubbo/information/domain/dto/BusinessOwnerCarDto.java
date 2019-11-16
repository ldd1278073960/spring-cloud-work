package com.dubbo.information.domain.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BusinessOwnerCarDto {
    /**
    * 汽车ID
    */
    private Integer carId;

    /**
    * 业主ID
    */
    private Integer ownerId;

    /**
    * 车牌号
    */
    private String carNum;

    /**
    * 汽车品牌
    */
    private String carBrand;

    /**
    * 9901 家用小汽车，9902 客车，9903 货车
    */
    private String carType;

    /**
    * 颜色
    */
    private String carColor;

    /**
    * 车位ID
    */
    private String psId;

    /**
    * 创建时间
    */
    private Date createTime;

}