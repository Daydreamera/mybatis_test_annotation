package com.datayes.domain;

public class Author {
    int ID;
    String PSN_NAME;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPSN_NAME() {
        return PSN_NAME;
    }

    public void setPSN_NAME(String PSN_NAME) {
        this.PSN_NAME = PSN_NAME;
    }

    @Override
    public String toString() {
        return "Author{" +
                "ID=" + ID +
                ", PSN_NAME='" + PSN_NAME + '\'' +
                '}';
    }
}
