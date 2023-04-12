package org.example.simpledemo.aftercommand.commandasreciever;

import org.example.simpledemo.aftercommand.Command;

public class BuildCommand implements Command {
    private String projectName;

    public BuildCommand(String projectName) {
        this.projectName = projectName;
    }


    @Override
    public void Execute() {
//        Builder.build("SDSFFsfd");
    }
}
