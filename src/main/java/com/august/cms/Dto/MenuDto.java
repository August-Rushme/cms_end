package com.august.cms.Dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author August
 * @date 2021/9/23 11:28
 * @lastEditors: August
 * @version:1.0
 */
public class MenuDto {

    private  String icon;

    private  Integer id;

    private  String name;

    private  Integer sort;

    private Integer type;

    private  String path;

    private List<MenuDto> children = new ArrayList<>();

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<MenuDto> getChildren() {
        return children;
    }

    public void setChildren(List<MenuDto> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "MenuDto{" +
                "icon='" + icon + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", sort=" + sort +
                ", type=" + type +
                ", path='" + path + '\'' +
                ", children=" + children +
                '}';
    }
}
