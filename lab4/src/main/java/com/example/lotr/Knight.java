package com.example.lotr;

import java.util.Random;

import com.example.kick.KingKick;

public class Knight extends Character{

    public Knight() {
        super(2 + new Random().nextInt(13), 2 + new Random().nextInt(13), new KingKick());
    }
    
}
