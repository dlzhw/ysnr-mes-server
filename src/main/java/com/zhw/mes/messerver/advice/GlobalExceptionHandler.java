package com.zhw.mes.messerver.advice;

import com.zhw.mes.messerver.common.exception.BusinessException;
import com.zhw.mes.messerver.common.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.core.NestedRuntimeException;

@ControllerAdvice(annotations = {RestController.class})
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ApiResponse handleBusinessException(BusinessException exception){
        return ApiResponse.from(exception);
    }

    /*@ExceptionHandler(NestedRuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiResponse handleBusinessException(NestedRuntimeException exception){

        return ApiResponse.from(exception);
    }*/

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ApiResponse handleBusinessException(Exception exception){

        return ApiResponse.from(exception);
    }


}
