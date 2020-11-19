package UI;

public class Menu implements IMenu {

    public void showMainMenu() {
        System.out.println("1) Show Menu");
        System.out.println("9) Exit");
    }

    public void newLine() {
        System.out.println("\n");
    }

    public void exit() {
        System.out.println("Exiting ..");
    }
}

