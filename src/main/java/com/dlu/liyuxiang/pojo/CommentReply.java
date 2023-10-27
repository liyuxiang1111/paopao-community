package com.dlu.liyuxiang.pojo;

public class CommentReply {
    private Long id;

    private Long commentId;

    private Long userId;

    private Long atUserId;

    private String content;

    private String ip;

    private String ipLoc;

    private Long createdOn;

    private Long modifiedOn;

    private Long deletedOn;

    private Byte isDel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAtUserId() {
        return atUserId;
    }

    public void setAtUserId(Long atUserId) {
        this.atUserId = atUserId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getIpLoc() {
        return ipLoc;
    }

    public void setIpLoc(String ipLoc) {
        this.ipLoc = ipLoc == null ? null : ipLoc.trim();
    }

    public Long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
    }

    public Long getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Long modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Long getDeletedOn() {
        return deletedOn;
    }

    public void setDeletedOn(Long deletedOn) {
        this.deletedOn = deletedOn;
    }

    public Byte getIsDel() {
        return isDel;
    }

    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }
}