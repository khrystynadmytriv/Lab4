package com.example.lotr;

import java.util.Random;

import com.example.kick.KingKick;

public class King extends Character{

    public King() {
        super(5 + new Random().nextInt(11), 5 + new Random().nextInt(11), new KingKick());
    }
    
}
