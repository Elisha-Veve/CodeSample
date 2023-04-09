package org.example.simpledemo.aftercommand.commandasreciever;

import org.example.simpledemo.aftercommand.Command;

public class BuildAndRunCommand implements Command {

    private String projectName;
    private BuildCommand buildCommand;
    private RunCommand runCommand;

    public BuildAndRunCommand(String projectName) {
        this.projectName = projectName;
        buildCommand = new BuildCommand(projectName);
        runCommand = new RunCommand(projectName);
    }


    @Override
    public void Execute() {
        buildCommand.Execute();
        runCommand.Execute();
    }
}
