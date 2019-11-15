package com.dubbo.information.domain.vo;

import com.dubbo.api.domain.OwnerMemberVo;
import com.dubbo.information.domain.OwnerInformation;
import lombok.Data;

import java.util.List;

@Data
public class OwnerInformationVo {

    OwnerInformation ownerInformation;

    List<OwnerMemberVo>  ownerMemberVos;

}
