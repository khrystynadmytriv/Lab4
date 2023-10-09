package com.example.lotr;

import com.example.kick.KickStrategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter@AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy kickStrategy;
    
    public void kick(Character c){
        kickStrategy.kick(this,c);
    }
    public boolean isAlive(){
        return getHp() > 0;
    }
    public void setHp(int hp){
        this.hp = hp > 0 ? hp : 0;
    }
    public String toString(){
        return this.getClass().getSimpleName()+"{hp="+hp+", power="+power+"}";
    }
}

