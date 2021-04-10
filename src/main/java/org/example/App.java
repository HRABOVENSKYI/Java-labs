package org.example;

import java.util.List;

public class App {
    public static void main( String[] args ) {
        List<ElectricShaver> electricShaves = List.of(
                new ElectricShaver(),
                new ElectricShaver(
                        3000,
                        "China",
                        10,
                        2700
                ),
                new ElectricShaver(
                        3000,
                        "China",
                        10,
                        2700,
                        1,
                        "Aluminium",
                        "Philips",
                        40,
                        120
                )
        );

        electricShaves.forEach(System.out::println);

        ElectricShaver.powerInWatts = 45;
        ElectricShaver.printStaticPowerInWatts();
        electricShaves.get(0).printPowerInWatts();

        electricShaves.get(2).resetValues(
                3500,
                "Chinaaaaaaaaaaaaaa",
                10,
                2700,
                1,
                "Aluminium",
                "Philips",
                40,
                120
        );

        System.out.println(electricShaves.get(2));
    }
}
