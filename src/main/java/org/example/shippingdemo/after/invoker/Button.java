package org.example.shippingdemo.after.invoker;


import org.example.shippingdemo.after.command.Command;
import org.example.shippingdemo.after.ShippingHistory;

public class Button {
    private Command command;

    public Button() {}

    public Button(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
        ShippingHistory.getInstance().addToStack(command);
    }
}
