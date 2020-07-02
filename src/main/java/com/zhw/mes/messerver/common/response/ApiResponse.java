package com.zhw.mes.messerver.common.response;

import com.zhw.mes.messerver.common.exception.BusinessException;
import org.springframework.core.NestedRuntimeException;

/**
 * api响应结果
 */
public class ApiResponse {
    /**
     * 错误码
     */
    private String error_code;
    /**
     * 错误描述
     */
    private String error_msg;

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    /**
     * 业务异常
     * @param exception
     * @return
     */
    public static ApiResponse from(BusinessException exception){
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setError_code(exception.getCode());
        apiResponse.setError_msg(exception.getDesc());
        return apiResponse;
    }

    /**
     * spring 异常
     * @param exception
     * @return
     */
    public static ApiResponse from(NestedRuntimeException exception){
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setError_code("998");
        apiResponse.setError_msg(exception.getMessage());
        return apiResponse;
    }

    /**
     * 未知异常
     * @param exception
     * @return
     */
    public static ApiResponse from(Exception exception){
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setError_code("999");
        apiResponse.setError_msg(exception.getMessage());
        return apiResponse;
    }
}
