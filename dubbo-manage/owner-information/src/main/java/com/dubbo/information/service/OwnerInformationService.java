package com.dubbo.information.service;

import com.dubbo.information.domain.vo.OwnerInformationOwnerCarVo;
import com.dubbo.information.domain.vo.OwnerInformationVo;

/**
 * @author Administrator
 */
public interface OwnerInformationService {

    OwnerInformationVo selectByPrimaryKey(int ownerId);


    OwnerInformationOwnerCarVo selectByOwnerCatList(int ownerId);
}
