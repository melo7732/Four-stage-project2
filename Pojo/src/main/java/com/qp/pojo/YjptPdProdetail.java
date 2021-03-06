package com.qp.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * yjpt_pd_prodetail
 * @author 
 */
public class YjptPdProdetail implements Serializable {
    /**
     * 产品图片ID 主键
     */
    private Integer dtid;

    /**
     * 来源
     */
    private Integer sid;

    /**
     * 外键:产品ID
     */
    private Integer pdid;

    /**
     * 图片路径
     */
    private String path;

    /**
     * 图片描述
     */
    private String meg;

    /**
     * 是否有效(0=无效 1=有效)
     */
    private String isenable;

    /**
     * 图片类型
     */
    private String type;

    /**
     * 创建人
     */
    private String createtor;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    private Date modifytime;

    private static final long serialVersionUID = 1L;

    public Integer getDtid() {
        return dtid;
    }

    public void setDtid(Integer dtid) {
        this.dtid = dtid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getPdid() {
        return pdid;
    }

    public void setPdid(Integer pdid) {
        this.pdid = pdid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMeg() {
        return meg;
    }

    public void setMeg(String meg) {
        this.meg = meg;
    }

    public String getIsenable() {
        return isenable;
    }

    public void setIsenable(String isenable) {
        this.isenable = isenable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreatetor() {
        return createtor;
    }

    public void setCreatetor(String createtor) {
        this.createtor = createtor;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        YjptPdProdetail other = (YjptPdProdetail) that;
        return (this.getDtid() == null ? other.getDtid() == null : this.getDtid().equals(other.getDtid()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getPdid() == null ? other.getPdid() == null : this.getPdid().equals(other.getPdid()))
            && (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()))
            && (this.getMeg() == null ? other.getMeg() == null : this.getMeg().equals(other.getMeg()))
            && (this.getIsenable() == null ? other.getIsenable() == null : this.getIsenable().equals(other.getIsenable()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCreatetor() == null ? other.getCreatetor() == null : this.getCreatetor().equals(other.getCreatetor()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getModifytime() == null ? other.getModifytime() == null : this.getModifytime().equals(other.getModifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDtid() == null) ? 0 : getDtid().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getPdid() == null) ? 0 : getPdid().hashCode());
        result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
        result = prime * result + ((getMeg() == null) ? 0 : getMeg().hashCode());
        result = prime * result + ((getIsenable() == null) ? 0 : getIsenable().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCreatetor() == null) ? 0 : getCreatetor().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getModifytime() == null) ? 0 : getModifytime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dtid=").append(dtid);
        sb.append(", sid=").append(sid);
        sb.append(", pdid=").append(pdid);
        sb.append(", path=").append(path);
        sb.append(", meg=").append(meg);
        sb.append(", isenable=").append(isenable);
        sb.append(", type=").append(type);
        sb.append(", createtor=").append(createtor);
        sb.append(", createtime=").append(createtime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifytime=").append(modifytime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}