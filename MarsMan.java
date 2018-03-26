//package com.company;

import java.util.ArrayList;

public class MarsMan {
    public static void main(String[] args) throws Exception {
        System.out.println("Running Simulation");

        Simulation simulation = new Simulation();
        ArrayList itemsU1 = simulation.loadItems("src/phase-1.txt");
        simulation.loadU1(itemsU1);
        System.out.println("Now Loading the items for U2");
        ArrayList itemsU2 = simulation.loadItems("src/phase-2.txt");
        //simulation.loadU2(itemsU2);
    }
}
