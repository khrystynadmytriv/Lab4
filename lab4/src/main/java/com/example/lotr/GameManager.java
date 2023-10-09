package com.example.lotr;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            if (c2.isAlive()) {
                c2.kick(c1);
            }
        }

        if (!c1.isAlive() && !c2.isAlive()) {
            System.out.println("It's a draw!");
        } else if (c1.isAlive()) {
            System.out.println("Character 1 wins!");
        } else {
            System.out.println("Character 2 wins!");
        }
    }
}

