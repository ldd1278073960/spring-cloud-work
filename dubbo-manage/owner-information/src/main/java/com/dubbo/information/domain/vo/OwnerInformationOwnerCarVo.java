package com.dubbo.information.domain.vo;

import com.dubbo.information.domain.OwnerInformation;
import com.dubbo.information.domain.dto.BusinessOwnerCarDto;
import lombok.Data;

import java.util.List;

/**
 * @author Administrator
 */
@Data
public class OwnerInformationOwnerCarVo {

    List<BusinessOwnerCarDto> businessOwnerCarDtoList;

    OwnerInformation ownerInformation;

}
