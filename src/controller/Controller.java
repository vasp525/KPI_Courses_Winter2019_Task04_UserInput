package controller;

import view.TextConstants;
import view.View;
import model.Model;
import java.util.Scanner;

public class Controller {
    View view;
    Model model;
    Scanner scanner;

    public Controller (View view, Model model, Scanner scanner) {
        this.view = view;
        this.model = model;
        this.scanner = scanner;
    }


    public void start() {
        inputStringWithRegex(TextConstants.NAME, RegexContainer.REGEX_NAME);
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