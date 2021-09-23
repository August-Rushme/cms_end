package com.august.cms.resp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author August
 * @date 2021/9/23 11:31
 * @lastEditors: August
 * @version:1.0
 */
public class MenusResp {
    private Integer id;

    private Integer parentId;

    private String name;

    private String path;

    private String permission;

    private Integer type;

    private String icon;

    private Integer sort;

    private Date createdat;

    private Date updatedat;

    private String statuts;

    private List<MenusResp> children = new ArrayList<>();

    public List<MenusResp> getChildren() {
        return children;
    }

    public void setChildren(List<MenusResp> children) {
        this.children = children;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public Date getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }

    public String getStatuts() {
        return statuts;
    }

    public void setStatuts(String statuts) {
        this.statuts = statuts;
    }

    @Override
    public String toString() {
        return "MenusResp{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", permission='" + permission + '\'' +
                ", type=" + type +
                ", icon='" + icon + '\'' +
                ", sort=" + sort +
                ", createdat=" + createdat +
                ", updatedat=" + updatedat +
                ", statuts='" + statuts + '\'' +
                ", children=" + children +
                '}';
    }
}
