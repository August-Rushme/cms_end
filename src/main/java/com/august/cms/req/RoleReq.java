package com.august.cms.req;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author August
 * @date 2021/9/24 9:53
 * @lastEditors: August
 * @version:1.0
 */
public class RoleReq extends PageReq {
    private Integer id;

    private String name;

    private String code;

    private String remark;

    private LocalDateTime created;

    private LocalDateTime  updated;

    private Integer statu;

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

    public LocalDateTime  getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime  created) {
        this.created = created;
    }

    public LocalDateTime  getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime  updated) {
        this.updated = updated;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", code=").append(code);
        sb.append(", remark=").append(remark);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", statu=").append(statu);
        sb.append("]");
        return sb.toString();
    }
}
