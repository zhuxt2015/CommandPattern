package com.zhuxt.entity;

import sun.util.resources.CalendarData_in_ID;

/**
 * Created by Administrator on 2015/11/24.
 */
public class CeilingFan {
    private String locate;

    public CeilingFan(String locate) {
        this.locate = locate;
    }

    public void on() {
        System.out.println(locate + " ceilingfan is on");

    }

    public void off() {
        System.out.println(locate + " ceilingFan is off");
    }
}
