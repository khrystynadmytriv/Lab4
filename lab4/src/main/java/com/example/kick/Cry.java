package com.example.kick;
import com.example.lotr.Character;

public class Cry implements KickStrategy{

    @Override
    public void kick(Character whoKick, Character opponent) {
        System.out.println("😭😭😭");
    }
    
}
