package com.august.cms.req;

import javax.validation.constraints.NotNull;

/**
 * @author August
 * @date 2021/9/24 9:40
 * @lastEditors: August
 * @version:1.0
 */
public class PageReq {
    @NotNull(message = "【页码】不能为空")
    private int pageNum;
    @NotNull(message = "【每页条数】不能为空")
    private int pageSize;

    private String query;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    public String toString() {
        return "PageReq{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", query='" + query + '\'' +
                '}';
    }
}
