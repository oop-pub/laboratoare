package com.oop_pub.design_patterns2.entities;

import com.oop_pub.design_patterns2.strategies.WarriorStrategy;

public class Warrior extends Hero {

    private int damage;

    public Warrior(String name, int i) {

        this.name = name;
        this.damage = i;
        this.hp = 120;

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
        return new String("Mighty Warrior " + name + " of strength " + damage);
    }

    public int getBaseDamage() {
        return damage;
    }
}
