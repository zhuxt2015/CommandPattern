package com.zhuxt.entity;

/**
 * Created by Administrator on 2015/11/24.
 */
public class Garogedoor {
    private String locate ;

    public Garogedoor(String locate) {
        this.locate = locate;
    }

    public void on() {
        System.out.println(locate + " garogedoor is on");
    }

    public void off() {
        System.out.println(locate + " garogedoor is off");
    }
}
