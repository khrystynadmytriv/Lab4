package com.example.kick;
import java.util.Random;

import com.example.lotr.Character;

public class KingKick implements KickStrategy{
    @Override
    public void kick(Character whoKick, Character opponent) {
        int damage = new Random().nextInt(opponent.getPower() + 1);
        opponent.setHp(opponent.getHp()-damage);
    }
}
