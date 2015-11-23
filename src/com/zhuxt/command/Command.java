package com.zhuxt.command;

/**
 * Created by Administrator on 2015/11/24.
 */
public interface Command {

    public void execute();

    public void undo();
}
