package com.oop_pub.visitor.Implementations;

import com.oop_pub.visitor.Visitor;

/**
 * Implementations for printing an employee's data. Applies the operation only on objects
 * that implement Visitable, currently Employee and Boss.
 */
public class RevenueVisitor implements Visitor {
    @Override
    public void visit(Employee e) {
        System.out.println(e.getName() + " " + e.getSalary());
    }

    @Override
    public void visit(Boss b) {
        System.out.println(b.getName() + " " + (b.getSalary() + b.getBonus()));
    }
}
