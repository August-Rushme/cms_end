package com.august.cms.domain;

import java.util.Date;

public class RoleInfo {
    private Integer roleId;

    private String roleName;

    private String roleAuthority;

    private Date roleCreateat;

    private Date roleUpdateat;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleAuthority() {
        return roleAuthority;
    }

    public void setRoleAuthority(String roleAuthority) {
        this.roleAuthority = roleAuthority;
    }

    public Date getRoleCreateat() {
        return roleCreateat;
    }

    public void setRoleCreateat(Date roleCreateat) {
        this.roleCreateat = roleCreateat;
    }

    public Date getRoleUpdateat() {
        return roleUpdateat;
    }

    public void setRoleUpdateat(Date roleUpdateat) {
        this.roleUpdateat = roleUpdateat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", roleName=").append(roleName);
        sb.append(", roleAuthority=").append(roleAuthority);
        sb.append(", roleCreateat=").append(roleCreateat);
        sb.append(", roleUpdateat=").append(roleUpdateat);
        sb.append("]");
        return sb.toString();
    }
}