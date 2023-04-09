package org.example.simpledemo.aftercommand.commandasreciever;

import org.example.simpledemo.aftercommand.Command;

public class RunCommand implements Command {
    private String projectName;

    public RunCommand(String projectName) {
        this.projectName = projectName;
    }


    @Override
    public void Execute() {
        System.out.println("Running " + projectName + "...");
        System.out.println("Run complete");
    }


}
