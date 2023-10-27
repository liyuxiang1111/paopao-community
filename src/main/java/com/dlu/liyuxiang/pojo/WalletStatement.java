package com.dlu.liyuxiang.pojo;

public class WalletStatement {
    private Long id;

    private Long userId;

    private Long changeAmount;

    private Long balanceSnapshot;

    private String reason;

    private Long postId;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(Long changeAmount) {
        this.changeAmount = changeAmount;
    }

    public Long getBalanceSnapshot() {
        return balanceSnapshot;
    }

    public void setBalanceSnapshot(Long balanceSnapshot) {
        this.balanceSnapshot = balanceSnapshot;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
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