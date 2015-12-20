package com.bjwxhl.myapplication;

import java.io.Serializable;

/**
 * Created by CaiBing.Zhang on 2015/12/1.
 */
public class ShopBean implements Serializable{
    private static final long serialVersionUID = 4697554090473708884L;

    private int resImage;
    private String uuid;
    private String name;
    private String desc;
    private boolean falg;

    public int getResImage() {
        return resImage;
    }

    public void setResImage(int resImage) {
        this.resImage = resImage;
    }

    public boolean isFalg() {
        return falg;
    }

    public void setFalg(boolean falg) {
        this.falg = falg;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
