package com.dubbo.api.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class OwnerMemberVo implements Serializable {
    /**
    * 业主成员id
    */
    private Integer memberId;

    /**
    * 业主成员名字
    */
    private String memberName;

    /**
    * 与业主的关系
    */
    private String memberRelation;

    /**
    * 业主成员电话
    */
    private String memberPhone;

    /**
    * 业主成员性别
    */
    private String memberSex;

    /**
    * 业主成员年龄
    */
    private Integer memberAge;

    /**
    * 业主id
    */
    private Integer ownerId;

}