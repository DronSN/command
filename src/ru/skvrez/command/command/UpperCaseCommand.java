package ru.skvrez.command.command;

import ru.skvrez.command.service.UpperCaseService;

public class UpperCaseCommand implements Command {
    @Override
    public String execute(String text) {
        return UpperCaseService.process(text);
    }
}
