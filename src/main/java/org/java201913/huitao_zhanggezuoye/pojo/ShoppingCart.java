package org.java201913.huitao_zhanggezuoye.pojo;

import java.util.Date;

public class ShoppingCart {
    private Integer scid;

    private Integer scUsid;

    private Integer scSid;

    private Integer scnum;

    private Date scaddtime;

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public Integer getScUsid() {
        return scUsid;
    }

    public void setScUsid(Integer scUsid) {
        this.scUsid = scUsid;
    }

    public Integer getScSid() {
        return scSid;
    }

    public void setScSid(Integer scSid) {
        this.scSid = scSid;
    }

    public Integer getScnum() {
        return scnum;
    }

    public void setScnum(Integer scnum) {
        this.scnum = scnum;
    }

    public Date getScaddtime() {
        return scaddtime;
    }

    public void setScaddtime(Date scaddtime) {
        this.scaddtime = scaddtime;
    }
}