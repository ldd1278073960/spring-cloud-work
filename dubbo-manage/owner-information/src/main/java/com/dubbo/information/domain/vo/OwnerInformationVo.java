package com.dubbo.information.domain.vo;

import com.dubbo.api.domain.OwnerMemberVo;
import com.dubbo.information.domain.OwnerInformation;
import lombok.Data;

import java.util.List;

/**
 * @author Administrator
 *
 * 业主与业主成员的服务
 */
@Data
public class OwnerInformationVo {

    OwnerInformation ownerInformation;

    List<OwnerMemberVo>  ownerMemberVos;

}
