package com.august.cms.req;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author August
 * @date 2021/9/23 22:53
 * @lastEditors: August
 * @version:1.0
 */
public class EditMenuReq {
    private Integer id;

    private Integer parentId;

    private String name;

    private String path;

    private String permission;

    private Integer type;

    private String icon;

    private Integer sort;

    private LocalDateTime createdat;

    private LocalDateTime updatedat;

    private String statuts;

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

    public LocalDateTime getCreatedat() {
        return createdat;
    }

    public void setCreatedat(LocalDateTime createdat) {
        this.createdat = createdat;
    }

    public LocalDateTime getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(LocalDateTime updatedat) {
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
        return "EditMenuReq{" +
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
                '}';
    }
}
