package com.dubbo.information.service;

import com.dubbo.information.domain.dto.BusinessOwnerCarDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 *
 * @author Administrator
 *
 * 业主的车辆信息
 */
@FeignClient("packing-management")
public interface BusinessOwnerService {

    /**
     * 调用业主车辆详情的模板
     * @param ownerId
     * @return
     */
    @GetMapping("/ownerCarS/selectId/{ownerId}")
    List<BusinessOwnerCarDto> selectByPrimaryKey(@PathVariable("ownerId") int ownerId);
}
