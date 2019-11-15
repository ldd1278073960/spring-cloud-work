package com.dubbo.information.service;

import com.dubbo.information.domain.OwnerInformation;
import com.dubbo.information.domain.vo.OwnerInformationVo;

/**
 * @author Administrator
 */
public interface OwnerInformationService {

    OwnerInformation selectByPrimaryKey(int ownerId);


}
