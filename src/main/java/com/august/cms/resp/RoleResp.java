package com.august.cms.resp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author August
 * @date 2021/9/23 8:47
 * @lastEditors: August
 * @version:1.0
 */
public class RoleResp {
    private Integer id;

    private String name;

    private String code;

    private String remark;

    private Date created;

    private Date updated;

    private Integer statu;

    private List<Integer> menuIds = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    public List<Integer> getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(List<Integer> menuIds) {
        this.menuIds = menuIds;
    }

    @Override
    public String toString() {
        return "RoleResp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", remark='" + remark + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                ", statu=" + statu +
                ", menuIds=" + menuIds +
                '}';
    }
}
