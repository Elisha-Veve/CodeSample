package org.example.shippingdemo.after;


public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void onClick() {
        command.execute();
        ShippingHistory.getInstance().addToStack(command);
    }
}
