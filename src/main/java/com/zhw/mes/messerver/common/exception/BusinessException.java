package com.zhw.mes.messerver.common.exception;

import java.util.List;

/**
 * 业务异常基类
 */
public class BusinessException extends RuntimeException{
    /**
     * 业务错误代码
     */
    private String code;
    /**
     * 业务错误描述
     */
    private String desc;
    /**
     * 当时的参数,可用于bug重现或业务描述中的参数
     */
    private Object[] params;

    public BusinessException(String code, String desc) {
        super(desc);
        this.code = code;
        this.desc = desc;
    }

    public BusinessException(String code, String desc,Object ...params) {
        super(desc);
        this.code = code;
        this.desc = desc;
        this.params = params;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }
}
