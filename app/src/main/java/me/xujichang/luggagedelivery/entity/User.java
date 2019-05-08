package me.xujichang.luggagedelivery.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Des:LuggageDelivery - me.xujichang.luggagedelivery.entity
 *
 * @author xujichang
 * @date 2019-05-04 - 17:53
 * <p>
 * modify:
 */
@Entity
public class User {
    @PrimaryKey
    private Long userid;

    private String uname;

    private String useraddress;

    private String userbirth;

    private String useremail;

    private Integer usergender;

    private String username;

    private String userpassword;

    private String userphone;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public String getUserbirth() {
        return userbirth;
    }

    public void setUserbirth(String userbirth) {
        this.userbirth = userbirth;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public Integer getUsergender() {
        return usergender;
    }

    public void setUsergender(Integer usergender) {
        this.usergender = usergender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", uname='" + uname + '\'' +
                ", useraddress='" + useraddress + '\'' +
                ", userbirth='" + userbirth + '\'' +
                ", useremail='" + useremail + '\'' +
                ", usergender=" + usergender +
                ", username='" + username + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", userphone='" + userphone + '\'' +
                '}';
    }
}
