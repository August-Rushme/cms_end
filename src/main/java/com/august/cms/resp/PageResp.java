package com.august.cms.resp;

import java.util.List;

/**
 * @author August
 * @date 2021/9/24 9:41
 * @lastEditors: August
 * @version:1.0
 * pages; //总共页数
 * total, //总共有多少记录数
 */
public class PageResp<T> {
    private long total;

    private List<T> list;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageResp{" +
                "total=" + total +
                ", list=" + list +
                '}';
    }
}