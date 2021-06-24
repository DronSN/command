package ru.skvrez.command.service;

public class ReplaceService {
    public static String process(String text, String target, String replace) {
        return text.replaceAll(target, replace);
    }
}
