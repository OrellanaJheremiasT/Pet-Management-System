package controller;

import model.pets;

public class petadministrator {
    private pets[] petList;
    private int petCount;

    public petadministrator(int capacity) {
        petList = new pets[capacity];
        petCount = 0;
    }

    public void addPet(pets pet) {
        if (petCount >= petList.length) {
            final int NEW_CAPACITY = 10;
            pets[] aux = new pets[petList.length + NEW_CAPACITY];

            for (int i = 0; i < petList.length; i++) {
                aux[i] = petList[i];
            }

            petList = aux;
        }

        petList[petCount] = pet;
        petCount++;
    }

    public pets[] getPetList() {
        return petList;
    }
}
