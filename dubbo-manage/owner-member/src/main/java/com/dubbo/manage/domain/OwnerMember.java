package com.dubbo.manage.domain;

import lombok.Data;

@Data
public class OwnerMember {
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

    /**
    * 业主成员是否存在，1为存在，0为不存在
    */
    private Integer memberDel;
}