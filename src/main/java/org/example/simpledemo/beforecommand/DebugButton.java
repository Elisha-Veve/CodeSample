package org.example.simpledemo.beforecommand;

public class DebugButton extends Button{
    private String projectName;

    public DebugButton(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public void onClick() {
        System.out.println("Debugging " + projectName + "...");
        System.out.println("Debug complete");
    }
}
