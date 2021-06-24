package ru.skvrez.command;

import ru.skvrez.command.action.ReplaceMenuAction;
import ru.skvrez.command.action.ReplaceShortCutAction;
import ru.skvrez.command.action.UpperCaseMenuAction;
import ru.skvrez.command.command.ReplaceCommand;
import ru.skvrez.command.command.UpperCaseCommand;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor("test text");

        ReplaceCommand replaceEtoACommand = new ReplaceCommand("E", "A");
        UpperCaseCommand upperCaseCommand = new UpperCaseCommand();

        UpperCaseMenuAction upperCaseMenuAction = new UpperCaseMenuAction(upperCaseCommand, editor);
        upperCaseMenuAction.executeAction();
        System.out.println(editor.getText());

        ReplaceMenuAction replaceMenuAction = new ReplaceMenuAction(replaceEtoACommand, editor);
        replaceMenuAction.executeAction();
        System.out.println(editor.getText());

        ReplaceCommand replaceAtoECommand = new ReplaceCommand("A", "E");
        ReplaceShortCutAction replaceShortCutAction = new ReplaceShortCutAction(replaceAtoECommand, editor);
        replaceShortCutAction.executeAction();
        System.out.println(editor.getText());
    }
}
