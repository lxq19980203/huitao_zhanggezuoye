package org.java201913.huitao_zhanggezuoye.pojo;

import java.util.Date;

public class Shop {
    private Integer sid;

    private String sname;

    private String scode;

    private Double sweight;

    private Integer sStoreId;

    private String smaterial;

    private Date saddtime;

    private Integer sStcid;

    private Double sprice;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }

    public Double getSweight() {
        return sweight;
    }

    public void setSweight(Double sweight) {
        this.sweight = sweight;
    }

    public Integer getsStoreId() {
        return sStoreId;
    }

    public void setsStoreId(Integer sStoreId) {
        this.sStoreId = sStoreId;
    }

    public String getSmaterial() {
        return smaterial;
    }

    public void setSmaterial(String smaterial) {
        this.smaterial = smaterial;
    }

    public Date getSaddtime() {
        return saddtime;
    }

    public void setSaddtime(Date saddtime) {
        this.saddtime = saddtime;
    }

    public Integer getsStcid() {
        return sStcid;
    }

    public void setsStcid(Integer sStcid) {
        this.sStcid = sStcid;
    }

    public Double getSprice() {
        return sprice;
    }

    public void setSprice(Double sprice) {
        this.sprice = sprice;
    }
}