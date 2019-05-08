package me.xujichang.luggagedelivery.entity;

/**
 * Des:LuggageDelivery - me.xujichang.luggagedelivery.entity
 *
 * @author xujichang
 * @date 2019-04-26 - 00:43
 * <p>
 * modify:
 */
public class Order {
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
        this.adddate = adddate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFromuseraddress() {
        return fromuseraddress;
    }

    public void setFromuseraddress(String fromuseraddress) {
        this.fromuseraddress = fromuseraddress;
    }

    public String getFromusername() {
        return fromusername;
    }

    public void setFromusername(String fromusername) {
        this.fromusername = fromusername;
    }

    public String getFromuserphone() {
        return fromuserphone;
    }

    public void setFromuserphone(String fromuserphone) {
        this.fromuserphone = fromuserphone;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
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
        this.orderstatus = orderstatus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
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
