
package views;
import controller.petadministrator;
import java.util.Scanner;

public class executor {

    private final petadministrator administrador;
    private final Scanner scanner;

    public executor() {
        this.administrador = new petadministrator(5);
        this.scanner = new Scanner(System.in);
    }

    public void viewmenu (){
        int option;
        do {
            System.out.println("\n========== Pets Menu ==========");
            System.out.println("1. Add Pet");
            System.out.println("2. Print Pet Report");
            System.out.println("0. Exit");
            System.out.println("======================================");
            System.out.print("Select an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("\n--- Pet Report ---");
                    break;
                case 0:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }




        } while (option != 0);
    }
    



}
