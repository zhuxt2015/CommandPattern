package com.zhuxt.invoke;

import com.zhuxt.command.Command;
import com.zhuxt.command.noCommand;

/**
 * Created by Administrator on 2015/11/24.
 */
public class RemodeControlWithUndo {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemodeControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new noCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(int slot) {
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("--------- Remote Control -----------").append("\n");
        for (int i = 0; i < 7; i++) {
            stringBuffer.append("[slot ").append(i).append("]").append(onCommands[i].getClass().getName()).append("   ")
                    .append(offCommands[i].getClass().getName()).append("\n");
        }

        stringBuffer.append("[undo]   ").append(undoCommand.getClass().getName()).append("\n");
        return stringBuffer.toString();
    }


}
