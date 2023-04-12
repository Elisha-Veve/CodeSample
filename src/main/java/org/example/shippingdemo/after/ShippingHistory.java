package org.example.shippingdemo.after;

import java.util.Stack;

//Singleton
public class ShippingHistory {
    private Stack<Command> log;
    private Stack<Command> undoStack;
    private Stack<Command> redoStack;

    private static ShippingHistory instance;

    private ShippingHistory() {
        log = new Stack<>();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public static ShippingHistory getInstance() {
        if (instance == null)
            instance = new ShippingHistory();
        return instance;
    }

    public void addToStack(Command command) {
        //prototyping
        Command clone = command.clone();
        undoStack.add(clone);
        redoStack.clear();
        log.add(clone);
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            Command command = undoStack.pop();
            command.unexecute();
            redoStack.add(command);
            log.add(command);
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            Command command = redoStack.pop();
            command.execute();
            undoStack.add(command);
            log.add(command);
        }

    }
}
