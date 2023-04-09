package org.example.simpledemo.aftercommand;

import org.example.simpledemo.aftercommand.commandasreciever.*;

public class Main {

    public static void main(String[] args) {
        Command buildBlackJackProject = new BuildCommand("BlackJackProject");
        Command runBlackJackProject = new RunCommand("BlackJackProject");
        Command debugBlackJackProject = new DebugCommand("BlackJackProject");
        Command buildAndRunBlackJackProject = new BuildAndRunCommand("BlackJackProject");



        Button buildButton = new Button(buildBlackJackProject);
        Button debugButton = new Button(debugBlackJackProject);
        Button runButton = new Button(runBlackJackProject);
        Button buildAndRunButton = new Button(buildAndRunBlackJackProject);

//        buildButton.onClick();
//        runButton.onClick();
        buildAndRunButton.onClick();
    }
}
