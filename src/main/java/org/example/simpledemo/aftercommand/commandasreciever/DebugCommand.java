package org.example.simpledemo.aftercommand.commandasreciever;

import org.example.simpledemo.aftercommand.Command;

public class DebugCommand implements Command {
    private String projectName;

    public DebugCommand(String projectName) {
        this.projectName = projectName;
    }


    @Override
    public void Execute() {
        System.out.println("Debugging " + projectName + "...");
        System.out.println("Debug complete");
    }
}
