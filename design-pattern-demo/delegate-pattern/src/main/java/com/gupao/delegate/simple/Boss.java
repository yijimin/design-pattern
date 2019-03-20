package com.gupao.delegate.simple;

/**
 * Boss 类下达命令
 */
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }
}

