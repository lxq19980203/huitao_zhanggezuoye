package org.java201913.huitao_zhanggezuoye.pojo;

import java.util.Date;

public class Admin {
    private Integer adId;

    private String adName;

    private String adPass;

    private Date adAddtime;

    private Integer adStatus;

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public String getAdPass() {
        return adPass;
    }

    public void setAdPass(String adPass) {
        this.adPass = adPass;
    }

    public Date getAdAddtime() {
        return adAddtime;
    }

    public void setAdAddtime(Date adAddtime) {
        this.adAddtime = adAddtime;
    }

    public Integer getAdStatus() {
        return adStatus;
    }

    public void setAdStatus(Integer adStatus) {
        this.adStatus = adStatus;
    }
}