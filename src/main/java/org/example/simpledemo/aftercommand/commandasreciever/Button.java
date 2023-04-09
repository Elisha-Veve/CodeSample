package org.example.simpledemo.aftercommand.commandasreciever;

import org.example.simpledemo.aftercommand.Command;

public class Button {
    private int height;
    private int width;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }


    public void onClick() {
        command.Execute();
    }
}
