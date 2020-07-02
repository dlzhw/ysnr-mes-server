package com.zhw.mes.messerver.common.response;

/**
 * 单对象响应结果
 */
public class SingleResponse extends ApiResponse  {
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static SingleResponse from(Object obj){
        SingleResponse sor = new SingleResponse();
        sor.setData(obj);
        return sor;
    }
}
