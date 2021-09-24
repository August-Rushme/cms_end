package com.august.cms.req;

import java.util.ArrayList;
import java.util.List;

/**
 * @author August
 * @date 2021/9/24 15:34
 * @lastEditors: August
 * @version:1.0
 */
public class MenuIdsReq {
    private List<Integer> menuIds = new ArrayList<>();

    public List<Integer> getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(List<Integer> menuIds) {
        this.menuIds = menuIds;
    }

    @Override
    public String toString() {
        return "MenuIdsReq{" +
                "menuIds=" + menuIds +
                '}';
    }
}
