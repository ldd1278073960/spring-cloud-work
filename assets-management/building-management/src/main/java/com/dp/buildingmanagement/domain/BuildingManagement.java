package com.dp.buildingmanagement.domain;

import java.util.Date;
import lombok.Data;

@Data
public class BuildingManagement {
    /**
    * 楼ID
    */
    private Integer buildId;

    /**
    * 楼编号
    */
    private String floorNum;

    /**
    * 小区楼名称
    */
    private String name;

    /**
    * 用户ID
    */
    private Integer ownerId;

    /**
    * 备注
    */
    private String remark;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 数据状态，添加ADD，修改MOD 删除DEL
    */
    private String operate;
}