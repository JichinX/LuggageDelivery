package com.graduate.luggagedelivery.rest_server.entity;

public class TFlowLog {
    private Long id;

    private String adddate;

    private String note;

    private Long deptId;

    private Long userOrderId;

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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getUserOrderId() {
        return userOrderId;
    }

    public void setUserOrderId(Long userOrderId) {
        this.userOrderId = userOrderId;
    }
}