package org.java201913.huitao_zhanggezuoye.pojo;

import org.java201913.huitao_zhanggezuoye.pojo.Brand;

public class Stylechild {
    private Integer stcid;

    private String stcname;

    private Integer stBid;

    public Integer getStcid() {
        return stcid;
    }

    public void setStcid(Integer stcid) {
        this.stcid = stcid;
    }

    public String getStcname() {
        return stcname;
    }

    public void setStcname(String stcname) {
        this.stcname = stcname;
    }

    public Integer getStBid() {
        return stBid;
    }

    public void setStBid(Integer stBid) {
        this.stBid = stBid;
    }
    private Brand brand;

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}
}