package views;
import controller.petadministrator;
import controller.report;
import java.util.Scanner;
import model.pets;

public class executor {

    private final petadministrator administrador;
    private final Scanner scanner;
    
    public executor() {
        this.administrador = new petadministrator(5);
        this.scanner = new Scanner(System.in);
    }

    public void viewmenu () {
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
                    addpet();
                    break;
                case 2:
                    printreport();
                    break;
                case 0:
                    System.out.println("Exiting the system...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 0);
    }

    private void addpet() {
        System.out.println("\n--- Add New Pet ---");
        System.out.print("Enter pet name: ");
        String name = scanner.nextLine();

        System.out.print("Enter pet type: ");
        String type = scanner.nextLine();

        System.out.print("Enter pet age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        pets newPet = new pets(name, type, age);

        administrador.addPet(newPet);

        System.out.println("Pet added successfully!");
    }

    private void printreport() {
        System.out.println("\n--- Pet Report ---");
         String reportText = report.petreport(administrador.getPetList());
         System.out.println(reportText);
    }

    public static void main(String[] args) {
        executor vista = new executor();
        vista.viewmenu();
    }
}
