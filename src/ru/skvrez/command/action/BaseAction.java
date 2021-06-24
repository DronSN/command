package ru.skvrez.command.action;

import ru.skvrez.command.command.Command;
import ru.skvrez.command.Editor;

public class BaseAction {

    private final Command command;

    private final Editor editor;

    public BaseAction(Command command, Editor editor) {
        this.command = command;
        this.editor = editor;
    }

    public void executeAction() {
        editor.setText(command.execute(editor.getText()));
    }
}
