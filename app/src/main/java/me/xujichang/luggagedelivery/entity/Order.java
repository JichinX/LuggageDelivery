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
    private String start;
    private String end;
    private String mark;
    private String status;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
