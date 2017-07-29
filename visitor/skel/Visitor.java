package com.oop_pub.visitor;

import com.oop_pub.visitor.Implementations.Boss;
import com.oop_pub.visitor.Implementations.Employee;
import com.oop_pub.visitor.Implementations.Intern;

public interface Visitor {
    void visit(Employee e);

    void visit(Boss b);

    void visit(Intern intern);
}
