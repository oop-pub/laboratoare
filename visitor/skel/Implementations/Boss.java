package com.oop_pub.visitor.Implementations;

import com.oop_pub.visitor.Visitable;
import com.oop_pub.visitor.Visitor;

import java.util.LinkedList;

public class Boss extends Employee {
    protected float bonus;

    private LinkedList<Visitable> subordinates = new LinkedList<Visitable>();

    public Boss(String name, float salary, float bonus) {
        super(name, salary);

        this.bonus = bonus;
    }

    public Boss(String name, float salary, float extraHours, float bonus) {
        super(name, salary, extraHours);

        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public LinkedList<Visitable> getSubordinates() {
        //TODO

        return null;
    }

    public void addSubordinate(Visitable subordinate) {
        //TODO
    }

    //TODO ex1b - remove accept
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
