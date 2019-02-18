package controller;

import view.TextConstants;
import view.View;
import model.Model;
import java.util.Scanner;

public class Controller {
    View view;
    Model model;
    Scanner scanner;

    String name;
    String surname;
    String midname;
    StringBuilder surnameName;

    String nickName;


    public Controller (View view, Model model, Scanner scanner) {
        this.view = view;
        this.model = model;
        this.scanner = scanner;
    }


    public void start() {
        surname = inputStringWithRegex(TextConstants.SURNAME, RegexContainer.REGEX_SURNAME);
        name = inputStringWithRegex(TextConstants.NAME, RegexContainer.REGEX_NAME);
        midname = inputStringWithRegex(TextConstants.MIDDLE_NAME, RegexContainer.REGEX_MIDNAME);
        surnameName = (new StringBuilder(surname)).append(" ").append(name.substring(0,1)).append(".");


    }



    String inputStringWithRegex (String message, String regex) {
        String result;
        view.printAskForInput(message);
        while (!((scanner.hasNext()) && ((result = scanner.next()).matches(regex)))) {
            view.printWrongFormat(message);
        }
        return result;
    }


}