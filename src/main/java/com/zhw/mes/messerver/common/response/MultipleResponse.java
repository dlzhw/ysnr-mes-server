package com.zhw.mes.messerver.common.response;

import java.util.Collection;

/**
 * 列表数据响应结果
 */
public class MultipleResponse extends ApiResponse {
    private Collection<?> data;
    private Integer currPage;
    private Integer totalPage;
    private Integer pageSize;

    public Integer getCurrPage() {
        return currPage;
    }

    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Collection<?> getData() {
        return data;
    }

    public void setData(Collection<?> data) {
        this.data = data;
    }

    public static MultipleResponse from(Collection<?> data){
        MultipleResponse mor = new MultipleResponse();
        mor.setData(data);
        return mor;
    }

    public static MultipleResponse from(Collection<?> data, int pageSize, int currPage, int totalPage){
        MultipleResponse mor = new MultipleResponse();
        mor.setData(data);
        mor.setPageSize(pageSize);
        mor.setCurrPage(currPage);
        mor.setTotalPage(totalPage);
        return mor;
    }


}
