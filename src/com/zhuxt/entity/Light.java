package com.zhuxt.entity;

/**
 * Created by Administrator on 2015/11/24.
 */
public class Light {

    private String locate;

    public Light(String locate) {
        this.locate = locate;
    }

    public void on() {
        System.out.println(locate + " light is on");

    }

    public void off() {
        System.out.println(locate + " light is off");
    }
}
