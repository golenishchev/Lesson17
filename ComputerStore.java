package com.example.lesson17;

import java.util.ArrayList;
import java.util.ListIterator;

public class ComputerStore {
    public static void main(String[] args) {
        Computer myComputerStore = new Computer();
        ArrayList<Computer> catalogComputersList = new ArrayList<Computer>();
        catalogComputersList.add(new Computer("2 x 1.6 GHz", "4 GB", "512 GB", "GeForce 210", "350 Watt"));
        catalogComputersList.add(new Computer("2 x 3.2 GHZ", "8 GB", "1 TB", "Radeon R7 370", "550 Watt"));
        catalogComputersList.add(new Computer("2 x 3.7 GHz", "16 GB", "1 TB", "GeForce GTX 970", "550 Watt"));
        System.out.println(catalogComputersList.get(2));
        System.out.println(catalogComputersList);
    }
}
