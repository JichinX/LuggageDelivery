package me.xujichang.luggagedelivery.entity;

public class Flow {
    private Long id;

    private String adddate;

    private String note;

    private Long deptId;

    private Long userOrderId;

    public Long getId() {
        return id;
    }

    public void setId(Long pId) {
        id = pId;
    }

    public String getAdddate() {
        return adddate;
    }

    public void setAdddate(String pAdddate) {
        adddate = pAdddate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String pNote) {
        note = pNote;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long pDeptId) {
        deptId = pDeptId;
    }

    public Long getUserOrderId() {
        return userOrderId;
    }

    public void setUserOrderId(Long pUserOrderId) {
        userOrderId = pUserOrderId;
    }
}
