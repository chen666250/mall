package com.mall.demo.model;

import java.io.Serializable;

public class Vendor implements Serializable {
    private Integer vendorId;

    private String vendorName;

    private String vendorDescrible;

    private static final long serialVersionUID = 1L;

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorDescrible() {
        return vendorDescrible;
    }

    public void setVendorDescrible(String vendorDescrible) {
        this.vendorDescrible = vendorDescrible;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vendorId=").append(vendorId);
        sb.append(", vendorName=").append(vendorName);
        sb.append(", vendorDescrible=").append(vendorDescrible);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}