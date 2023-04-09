package org.example.simpledemo.beforecommand;

public class BuildAndDebugButton extends Button{
    private String projectName;

    public BuildAndDebugButton(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public void onClick() {
        BuildButton buildButton = new BuildButton(projectName);
        buildButton.onClick();
        System.out.println("Debugging " + projectName + "...");
        System.out.println("Debug complete");
    }
}
