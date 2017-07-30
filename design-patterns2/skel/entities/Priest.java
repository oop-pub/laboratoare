package com.oop_pub.design_patterns2.entities;

import com.oop_pub.design_patterns2.strategies.PriestStrategy;

public class Priest extends Hero {

    private int knowledge;

    public Priest(String name, int i) {

        this.name = name;
        this.knowledge = i;
        this.hp = 100;
        //TODO initialize strategy accordingly
    }

    @Override
    public void attack() {
        // TODO check if hero can attack
        // if it can use the strategy to attack and update Hero HP (deduct target damage)
        // and print a message
    }

    @Override
    public String toString() {
        return new String("Sneaky Priest " + name + " of knowledge " + knowledge);
    }

    public int getBaseDamage() {
        return knowledge;
    }
}
