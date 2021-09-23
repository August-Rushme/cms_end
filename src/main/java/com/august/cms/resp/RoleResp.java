package com.august.cms.resp;

import java.util.Date;

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
