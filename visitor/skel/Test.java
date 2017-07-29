package com.oop_pub.visitor;

import com.oop_pub.visitor.Implementations.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {

        System.out.println("---------- Ex. 1 ----------");
        test1();

        System.out.println("---------- Ex. 2 ----------");
        test2();

        System.out.println("---------- Ex. 3 ----------");
        test3();

        System.out.println("---------- Ex. 4 ----------");
        test4();
    }

    private static void test1() {

        List<Employee> employees = new LinkedList<Employee>();
        employees.add(new Employee("Bob", 200));
        employees.add(new Employee("Trudy", 900));
        employees.add(new Boss("Alice", 10000, 42));

        Visitor v = new RevenueVisitor();
        for (Employee e : employees)
            e.accept(v);
    }

    private static void test2() {
        /*
         * Dr
		 *   - Clara
		 *   - River
		 *   	- Amy
		 *   	- Rory
		 */
        Boss ceo = new Boss("Dr", 10000, 2, 42);
        Boss boss = new Boss("River", 9000, 7, 20);

        boss.addSubordinate(new Employee("Amy", 2500, 10));
        boss.addSubordinate(new Employee("Rory", 2000, 5));

        ceo.addSubordinate(new Employee("Clara", 2200, 0));
        ceo.addSubordinate(boss);

        MostHardworkingEmployeeFinder extraHoursVisitor =
                new MostHardworkingEmployeeFinder();
        //TODO use MostHardworkingEmployeeFinder and TreeVisitor
        //hint: ceo is root-node for TreeVisitor

        System.out.format("The %s are the most hardworking\n",
                extraHoursVisitor.isBossHardWorking() ? "bosses " : "employees");

        //TODO try also other values for extraHours for the objects declared
        //above
    }

    private static void test3() {
        /*
         * Dr
		 *   - Clara
		 *   - River
		 *   	- Amy
		 *   	- Rory
		 *   - LowlyIntern
		 */
        Boss ceo = new Boss("Dr", 10000, 2, 42);
        Boss boss = new Boss("River", 9000, 7, 20);

        boss.addSubordinate(new Employee("Amy", 2500, 10));
        boss.addSubordinate(new Employee("Rory", 2000, 5));

        ceo.addSubordinate(new Employee("Clara", 2200, 0));
        ceo.addSubordinate(boss);

        //TODO add an intern
        //TODO apply the RevenueVisitor on ceo's subordinates

        MostHardworkingEmployeeFinder extraHoursVisitor =
                new MostHardworkingEmployeeFinder();
        //TODO use MostHardworkingEmployeeFinder and TreeVisitor
        //hint: ceo is root-node for TreeVisitor

        System.out.format("The %s are the most hardworking\n",
                extraHoursVisitor.isBossHardWorking() ? "bosses " : "employees");
    }

    private static void test4() {

        Path startingDir = Paths.get(".");
        FilesCounter counter = new FilesCounter();

        //TODO
        // use Files.walkFileTree
        // get the list of files and  print its size and their paths
    }
}
