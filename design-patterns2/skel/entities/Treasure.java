package com.oop_pub.design_patterns2.entities;

/**
 * Class representing a "treasure". The map contains treasures that the heroes
 * will collect.
 *
 * The treasures have a special story(lore) associated with them.
 */
public class Treasure {

    protected String name;
    protected String lore;
    protected int posx, posy;
    protected DamageType dmgT;
    protected int dmg;

    public Treasure(String name, String lore, DamageType dmgT, int dmg) {
        this.name = name;
        this.lore = lore;
        this.dmgT = dmgT;
        this.dmg = dmg;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public DamageType getDamageType() {
        return dmgT;
    }

    public void setDamageType(DamageType dmgT) {
        this.dmgT = dmgT;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    /**
     * How to get x3 damage modifier:
     * Blunt + Warrior
     * Magic + Mage
     * Poison + Priest
     */

    public enum DamageType {
        Blunt, Magic, Poison
    }
}
