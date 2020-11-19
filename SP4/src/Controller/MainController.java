package Controller;

import DBConnector.*;
import Services.*;
import UI.*;

import java.util.Scanner;

public class MainController {
    Scanner sc = new Scanner(System.in);
    IDBConnector dbc = new DBConnector();
    IPizzaService ps = new PizzaService();
    IMenu menu = new Menu();
    int choice = 0;

    public void runProgram() {
        while (choice != 9) {
            dbc.getMyConnection();
            menu.showMainMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ps.showPizzaMenu();
                    menu.newLine();
                    break;
                case 9:
                    menu.exit();
                    break;
            }
        }
    }
}
