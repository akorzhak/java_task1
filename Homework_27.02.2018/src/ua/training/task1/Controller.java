package ua.training.task1;

import java.util.Scanner;

/**
 * Created by Alyona Korzhakova on 27.02.2018.
 */

public class Controller {

    public static final String REGEX_HELLO = "Hello";
    public static final String REGEX_WORLD = "world!";

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        String result;
        Scanner sc0 = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        do {
            result = inputFrase0(sc0);
            if( ! result.equals(REGEX_HELLO))
                view.printMessage(View.WRONG_INPUT);
        }
        while( ! result.equals(REGEX_HELLO));
        do {
            result = inputFrase1(sc1);
            if( ! result.equals(REGEX_WORLD))
                view.printMessage(View.WRONG_INPUT);
        }
        while( ! result.equals(REGEX_WORLD));
        System.out.println(model.addTwoWords());
    }

    // The Utility methods
    public String inputFrase0(Scanner sc0) {
        view.printMessage(View.INPUT_FIRST_WORD);
        model.setValue0(sc0.nextLine());
        return model.getValue0();
    }

    public String inputFrase1(Scanner sc1) {
        view.printMessage(View.INPUT_SECOND_WORD);
        model.setValue1(sc1.nextLine());
        return model.getValue1();
    }
}
