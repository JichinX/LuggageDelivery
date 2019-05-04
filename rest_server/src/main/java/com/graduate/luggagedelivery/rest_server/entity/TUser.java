package com.graduate.luggagedelivery.rest_server.entity;

public class TUser {
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
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public String getUserbirth() {
        return userbirth;
    }

    public void setUserbirth(String userbirth) {
        this.userbirth = userbirth == null ? null : userbirth.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
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
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }
}