package com.dp.buildingmanagement.utils;

import lombok.Builder;
import lombok.Data;

/**
 * @author Administrator
 */

@Data
@Builder
public class Result<T> {

    private String msg;
    private int status;
    private T data;

    public static com.dp.floormanagement.utils.Result error() {
        return builder().msg("error").status(40004).build();
    }

    public static <T> com.dp.floormanagement.utils.Result success(T data) {

        return builder().status(20000).msg("Success").data(data).build();

    }

}
