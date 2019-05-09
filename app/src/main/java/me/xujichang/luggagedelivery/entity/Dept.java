package me.xujichang.luggagedelivery.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Dept {
    @PrimaryKey
    private Long id;

    private String address;

    private String name;

    private String note;

    private String scale;

    public Long getId() {
        return id;
    }

    public void setId(Long pId) {
        id = pId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String pAddress) {
        address = pAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        name = pName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String pNote) {
        note = pNote;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String pScale) {
        scale = pScale;
    }

    @Override
    public String toString() {
        return name;
    }
}
