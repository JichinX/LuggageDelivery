package com.graduate.luggagedelivery.rest_server.entity;

public class TLineStation {
    private Long id;

    private Integer stationindex;

    private Long deptId;

    private Long lineId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStationindex() {
        return stationindex;
    }

    public void setStationindex(Integer stationindex) {
        this.stationindex = stationindex;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }
}