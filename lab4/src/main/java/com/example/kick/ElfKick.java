package com.example.kick;
import com.example.lotr.Character;

public class ElfKick implements KickStrategy{
    @Override
    public void kick(Character whoKick, Character opponent) {
        if (opponent.getHp() < whoKick.getHp()) {
            opponent.setHp(0);
        } else {
            whoKick.setHp(1);
        }
    }
    
}
