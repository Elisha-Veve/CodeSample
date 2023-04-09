package org.example.simpledemo.beforecommand;

public class BuildAndRunButton extends Button{
    private String projectName;

    public BuildAndRunButton(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public void onClick() {
        System.out.println("Building " + projectName + "...");
        System.out.println("Build complete");

        System.out.println("Running " + projectName + "...");
        System.out.println("Run complete");
    }
}
