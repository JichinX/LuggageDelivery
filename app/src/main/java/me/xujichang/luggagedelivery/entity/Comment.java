package me.xujichang.luggagedelivery.entity;

/**
 * Des:LuggageDelivery - me.xujichang.luggagedelivery.entity
 *
 * @author xujichang
 * @date 2019-05-07 - 22:29
 * <p>
 * modify:
 */
public class Comment {
    private Long id;

    private String adddate;

    private String userphone;

    private String content;

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

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
