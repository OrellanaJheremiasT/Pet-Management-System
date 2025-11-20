package views;
import controller.petadministrator;
import controller.report;
import model.pets;

public class executor {
    public static void main(String[] args) {
        petadministrator admin = new petadministrator(5);
        admin.addPet(new pets("Firulais", "Dog", 3));

        System.out.println(report.petreport(admin.getPetList()));

        
    }

}
