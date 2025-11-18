package co.istad.staffmanagement;

public class SmsProgram {

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        do {
            ViewUtil.printMenu();

            Integer menuOption = InputUtil.getInteger("Enter menu option");

            switch (menuOption) {
                case 1 -> ViewUtil.printHeader("List staff");
                case 2 -> ViewUtil.printHeader("Search staff");
                case 3 -> ViewUtil.printHeader("Add staff");
                case 4 -> ViewUtil.printHeader("Update staff");
                case 5 -> ViewUtil.printHeader("Delete staff");
                case 0 -> System.exit(0);
                default -> ViewUtil.printHeader("Invalid menu option..!");
            }
        } while (true);
    }

}