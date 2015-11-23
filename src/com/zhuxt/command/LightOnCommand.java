package com.zhuxt.command;

import com.zhuxt.entity.Light;

/**
 * Created by Administrator on 2015/11/24.
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
