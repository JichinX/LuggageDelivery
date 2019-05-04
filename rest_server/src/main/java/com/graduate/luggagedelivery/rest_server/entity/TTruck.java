package com.graduate.luggagedelivery.rest_server.entity;

public class TTruck {
    private Long id;

    private String licenseplate;

    private String usestatus;

    private String vinner;

    private String vlength;

    private String vload;

    private String vtype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate == null ? null : licenseplate.trim();
    }

    public String getUsestatus() {
        return usestatus;
    }

    public void setUsestatus(String usestatus) {
        this.usestatus = usestatus == null ? null : usestatus.trim();
    }

    public String getVinner() {
        return vinner;
    }

    public void setVinner(String vinner) {
        this.vinner = vinner == null ? null : vinner.trim();
    }

    public String getVlength() {
        return vlength;
    }

    public void setVlength(String vlength) {
        this.vlength = vlength == null ? null : vlength.trim();
    }

    public String getVload() {
        return vload;
    }

    public void setVload(String vload) {
        this.vload = vload == null ? null : vload.trim();
    }

    public String getVtype() {
        return vtype;
    }

    public void setVtype(String vtype) {
        this.vtype = vtype == null ? null : vtype.trim();
    }
}