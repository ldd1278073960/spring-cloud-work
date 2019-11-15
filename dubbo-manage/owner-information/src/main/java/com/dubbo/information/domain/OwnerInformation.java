package com.dubbo.information.domain;

import lombok.Data;

@Data
public class OwnerInformation {
    /**
    * 业主信息id
    */
    private Integer ownerId;

    /**
    * 业主姓名
    */
    private String ownerName;

    /**
    * 性别
    */
    private String ownerSex;

    /**
    * 业主年龄
    */
    private String ownerAge;

    /**
    * 业主联系方式
    */
    private String phone;

    /**
    * 创建员工
    */
    private String creator;

    /**
    * 是否注销，1表示否，0表示是
    */
    private Integer ownerDel;
}