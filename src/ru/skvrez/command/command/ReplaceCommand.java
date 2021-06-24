package ru.skvrez.command.command;

import ru.skvrez.command.service.ReplaceService;

public class ReplaceCommand implements Command {

    private final String target;
    private final String replace;

    public ReplaceCommand(String target, String replace) {
        this.target = target;
        this.replace = replace;
    }

    @Override
    public String execute(String text) {
        return ReplaceService.process(text, target, replace);
    }
}
