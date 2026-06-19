package main;

import models.MenuItem;

public class Main {

    public static void main(String[] args) {

        MenuItem pizza =
                new MenuItem(
                        1,
                        "Pizza",
                        299
                );

        System.out.println(pizza);
    }
}