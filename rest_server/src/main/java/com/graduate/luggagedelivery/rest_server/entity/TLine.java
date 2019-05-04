package com.graduate.luggagedelivery.rest_server.entity;

public class TLine {
    private Long id;

    private String name;

    private Long endDeptId;

    private Long startDeptId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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