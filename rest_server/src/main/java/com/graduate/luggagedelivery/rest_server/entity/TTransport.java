package com.graduate.luggagedelivery.rest_server.entity;

public class TTransport {
    private Long id;

    private String adddate;

    private Integer transindex;

    private String transstatus;

    private Long driverId;

    private Long lineId;

    private Long truckId;

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

    public Integer getTransindex() {
        return transindex;
    }

    public void setTransindex(Integer transindex) {
        this.transindex = transindex;
    }

    public String getTransstatus() {
        return transstatus;
    }

    public void setTransstatus(String transstatus) {
        this.transstatus = transstatus == null ? null : transstatus.trim();
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public Long getTruckId() {
        return truckId;
    }

    public void setTruckId(Long truckId) {
        this.truckId = truckId;
    }
}