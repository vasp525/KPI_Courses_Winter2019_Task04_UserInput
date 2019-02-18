package controller;

public interface RegexContainer {
    String REGEX_NAME = "[А-Я][а-я]{1,20}";
    String REGEX_SURNAME = "[А-Я][а-я]{1,20}";
    String REGEX_MIDNAME = "[А-Я][а-я]{1,20}";
    String REGEX_NIKNAME = "[A-Za-z0-9]"; // need to be checked

}