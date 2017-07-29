package com.oop_pub.visitor.Implementations;


import com.oop_pub.visitor.Visitable;
import com.oop_pub.visitor.Visitor;

/**
 * Implementations for tree traversal - separate the concerns: a visitor for data
 * operations (e.g. compute average percentage) and this visitor for traversing
 * the nodes and applying the operation visitor.
 */
public class TreeVisitor implements Visitor {

    private Visitor baseVisitor;

    public TreeVisitor(Visitor baseVisitor) {
        this.baseVisitor = baseVisitor;
    }

    @Override
    public void visit(Employee e) {
        //TODO
    }

    @Override
    public void visit(Boss b) {
        //TODO
    }

    public Visitor getBaseVisitor() {
        return baseVisitor;
    }
}
