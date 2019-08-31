package com.company;

public class Member {

    private String name;
    private String cpr;
    private boolean isFullMember;

    public Member() {
    }

    public Member(String name, String cpr, boolean isFullMember) {
        this.name = name;
        this.cpr = cpr;
        this.isFullMember = isFullMember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public boolean isFullMember() {
        return isFullMember;
    }

    public void setFullMember(boolean fullMember) {
        isFullMember = fullMember;
    }

}
