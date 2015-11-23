package com.zhuxt.invoke;

import com.zhuxt.command.LightOffCommand;
import com.zhuxt.command.LightOnCommand;
import com.zhuxt.entity.Light;

import java.util.List;

/**
 * Created by Administrator on 2015/11/24.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemodeControlWithUndo rcw = new RemodeControlWithUndo();
        Light light = new Light("Living Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(light);
        LightOffCommand livingRoomLightOff = new LightOffCommand(light);



        rcw.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        System.out.println(rcw.toString());

        rcw.onButtonWasPushed(0);
        rcw.offButtonWasPushed(0);
        rcw.undoButtonWasPushed(0);
    }
}
