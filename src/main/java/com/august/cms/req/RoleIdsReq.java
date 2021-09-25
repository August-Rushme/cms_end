package com.august.cms.req;

import java.util.ArrayList;
import java.util.List;

/**
 * @author August
 * @date 2021/9/25 15:37
 * @lastEditors: August
 * @version:1.0
 */
public class RoleIdsReq {
    private List<Integer> roleIds = new ArrayList<>();

    public List<Integer> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Integer> roleIds) {
        this.roleIds = roleIds;
    }

    @Override
    public String toString() {
        return "RoleIdsReq{" +
                "roleIds=" + roleIds +
                '}';
    }
}
