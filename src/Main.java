import controller.Controller;
import model.Model;
import view.View;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(view, model, scanner);

        controller.start();


    }
}
