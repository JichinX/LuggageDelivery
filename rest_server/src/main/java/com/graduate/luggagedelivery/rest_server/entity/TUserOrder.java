package com.graduate.luggagedelivery.rest_server.entity;

public class TUserOrder {
    private Long id;

    private String adddate;

    private String address;

    private String fromuseraddress;

    private String fromusername;

    private String fromuserphone;

    private String goodsname;

    private Double goodsweight;

    private Double money;

    private String orderstatus;

    private String username;

    private String userphone;

    private Long endDeptId;

    private Long startDeptId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdddate() {
        return adddate;
    }

    public void setAdddate(String adddate) {
        this.adddate = adddate == null ? null : adddate.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getFromuseraddress() {
        return fromuseraddress;
    }

    public void setFromuseraddress(String fromuseraddress) {
        this.fromuseraddress = fromuseraddress == null ? null : fromuseraddress.trim();
    }

    public String getFromusername() {
        return fromusername;
    }

    public void setFromusername(String fromusername) {
        this.fromusername = fromusername == null ? null : fromusername.trim();
    }

    public String getFromuserphone() {
        return fromuserphone;
    }

    public void setFromuserphone(String fromuserphone) {
        this.fromuserphone = fromuserphone == null ? null : fromuserphone.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Double getGoodsweight() {
        return goodsweight;
    }

    public void setGoodsweight(Double goodsweight) {
        this.goodsweight = goodsweight;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus == null ? null : orderstatus.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public Long getEndDeptId() {
        return endDeptId;
    }

    public void setEndDeptId(Long endDeptId) {
        this.endDeptId = endDeptId;
    }

    public Long getStartDeptId() {
        return startDeptId;
    }

    public void setStartDeptId(Long startDeptId) {
        this.startDeptId = startDeptId;
    }
}