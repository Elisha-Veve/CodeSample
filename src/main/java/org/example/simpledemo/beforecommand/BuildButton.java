package org.example.simpledemo.beforecommand;

public class BuildButton extends Button {
    private String projectName;

    public BuildButton (String projectName) {
        this.projectName = projectName;
    }

    @Override
    public void onClick() {
        System.out.println("Building " + projectName + "...");
        System.out.println("Build complete");
    }
}
