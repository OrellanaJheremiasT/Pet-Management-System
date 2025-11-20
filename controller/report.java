package controller;

import model.pets;

public class report {
    public static String petreport (pets[] petList) {

        StringBuilder report = new StringBuilder();
        report.append(String.format("%15s %15s %5s\n", "Name", "Type", "Age"));
        report.append("=====================================\n");

        for (pets pet : petList) {
            if (pet != null) {
                report.append(pet.toString());
                report.append("\n");
            }

            
        }
        return report.toString();




    }

    




}
