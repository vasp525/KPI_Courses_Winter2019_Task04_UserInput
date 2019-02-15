package view;

public class View {





    public void printAskForInput(String message) {
        printOut(TextConstants.ASK_INPUT + message + ":");
    }

    public void printWrongFormat(String message) {
        if (message.equals(TextConstants.NAME)||message.equals(TextConstants.SURNAME)){
            printOut(TextConstants.WRONG_FORMAT_TEXT);
        }
        if (message.equals(TextConstants.CELL_PHONE)) {
            printOut(TextConstants.WRONG_FORMAT_NUMBER);
        }
    }

    void printOut(String s){
        System.out.println(s);
    }

}