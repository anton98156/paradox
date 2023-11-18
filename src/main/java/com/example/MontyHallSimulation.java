package com.example;

import java.util.Random;

public class MontyHallSimulation {

    public void play() {

        int totalIterations = 1000;
        int stayWins = 0;
        int switchWins = 0;

        Random random = new Random();

        for (int i = 0; i < totalIterations; i++) {

            int prizeDoor = random.nextInt(3);
            int selectedDoor = random.nextInt(3);

            int openedDoor;
            do {
                openedDoor = random.nextInt(3);
            } while (openedDoor == prizeDoor || openedDoor == selectedDoor);

            int switchedDoor;
            do {
                switchedDoor = random.nextInt(3);
            } while (switchedDoor == selectedDoor || switchedDoor == openedDoor);

            if (selectedDoor == prizeDoor) {
                stayWins++;
            } else if (switchedDoor == prizeDoor) {
                switchWins++;
            }
        }

        System.out.println("При выборе оставаться выиграло " + stayWins + " из " + totalIterations + " раз");
        System.out.println("При выборе сменить выбор выиграло " + switchWins + " из " + totalIterations + " раз");
    }
}
