package com.spartan.model;

import java.math.BigDecimal;
import java.util.Date;

public class MemberInfo {
    private Integer memId;

    private MemberType memberType;

    private String memName;

    private String memUserName;

    private String memPassword;

    private String memTel;

    private String memPhone;

    private String memAddress;

    private Byte memGender;

    private BigDecimal memMoney;

    private Integer memIntegral;

    private Date memBirthday;

    private Date memBeginTime;

    private Date memEndTime;

    private Byte delFlag;

    private Date lastSubtime;

    private User user;

    public Integer getMemId() {
        return memId;
    }

    public void setMemId(Integer memId) {
        this.memId = memId;
    }

    public MemberType getMemberType() {
        return memberType;
    }

    public void setMemberType(MemberType memberType) {
        if (memberType.getMemTypeId() == null) {
            this.memberType = null;
        } else {
            this.memberType = memberType;
        }
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName == null ? null : memName.trim();
    }

    public String getMemUserName() {
        return memUserName;
    }

    public void setMemUserName(String memUserName) {
        this.memUserName = memUserName == null ? null : memUserName.trim();
    }

    public String getMemPassword() {
        return memPassword;
    }

    public void setMemPassword(String memPassword) {
        this.memPassword = memPassword == null ? null : memPassword.trim();
    }

    public String getMemTel() {
        return memTel;
    }

    public void setMemTel(String memTel) {
        this.memTel = memTel == null ? null : memTel.trim();
    }

    public String getMemPhone() {
        return memPhone;
    }

    public void setMemPhone(String memPhone) {
        this.memPhone = memPhone == null ? null : memPhone.trim();
    }

    public String getMemAddress() {
        return memAddress;
    }

    public void setMemAddress(String memAddress) {
        this.memAddress = memAddress == null ? null : memAddress.trim();
    }

    public Byte getMemGender() {
        return memGender;
    }

    public void setMemGender(Byte memGender) {
        this.memGender = memGender;
    }

    public BigDecimal getMemMoney() {
        return memMoney;
    }

    public void setMemMoney(BigDecimal memMoney) {
        this.memMoney = memMoney;
    }

    public Integer getMemIntegral() {
        return memIntegral;
    }

    public void setMemIntegral(Integer memIntegral) {
        this.memIntegral = memIntegral;
    }

    public Date getMemBirthday() {
        return memBirthday;
    }

    public void setMemBirthday(Date memBirthday) {
        this.memBirthday = memBirthday;
    }

    public Date getMemBeginTime() {
        return memBeginTime;
    }

    public void setMemBeginTime(Date memBeginTime) {
        this.memBeginTime = memBeginTime;
    }

    public Date getMemEndTime() {
        return memEndTime;
    }

    public void setMemEndTime(Date memEndTime) {
        this.memEndTime = memEndTime;
    }

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public Date getLastSubtime() {
        return lastSubtime;
    }

    public void setLastSubtime(Date lastSubtime) {
        this.lastSubtime = lastSubtime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        if (user.getUserId() == null) {
            this.user = null;
        } else {
            this.user = user;
        }
    }

    @Override
    public String toString() {
        return "MemberInfo{" +
                "memId=" + memId +
                ", memberType=" + memberType +
                ", memName='" + memName + '\'' +
                ", memUserName='" + memUserName + '\'' +
                ", memPassword='" + memPassword + '\'' +
                ", memTel='" + memTel + '\'' +
                ", memPhone='" + memPhone + '\'' +
                ", memAddress='" + memAddress + '\'' +
                ", memGender=" + memGender +
                ", memMoney=" + memMoney +
                ", memIntegral=" + memIntegral +
                ", memBirthday=" + memBirthday +
                ", memBeginTime=" + memBeginTime +
                ", memEndTime=" + memEndTime +
                ", delFlag=" + delFlag +
                ", lastSubtime=" + lastSubtime +
                ", user=" + user +
                '}';
    }
}