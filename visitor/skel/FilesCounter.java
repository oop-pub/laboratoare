package com.oop_pub.visitor;

import static java.nio.file.FileVisitResult.*;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class FilesCounter extends SimpleFileVisitor<Path> {

    private ArrayList<Path> javaFiles;

    ArrayList<Path> getJavaFiles() {
        return javaFiles;
    }

    //TODO - override visit method(s)
}
