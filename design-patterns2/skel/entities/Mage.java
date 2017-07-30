package com.oop_pub.design_patterns2.entities;

import com.oop_pub.design_patterns2.strategies.MageStrategy;

public class Mage extends Hero {

    private int magicalDamage;

    public Mage(String name, int i) {

        this.name = name;
        this.magicalDamage = i;
        this.hp = 90;
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
        return new String("Powerful Mage " + name + " of strength " + magicalDamage);
    }

    public int getBaseDamage() {
        return magicalDamage;
    }
}
