package ua.training.task1;

/**
 * Created by Alyona Korzhakova on 27.02.2018.
 */

public class Main {
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }
}
