package com.dawidgalziewski; // class name (throwing name as it should corespond to file structure

import com.dawidgalziewski.Pokemon.Pikatchu; // importing using FQCN. we can also use * to import all classes from package
// if a class is in a non named package it will be placed in "default package". This is a bad practice and we should always try to make sure our classes are assigned to packages

public class Main { // in a package this class fully qualafied class name (FQCN) would be com.dawidgaleziewski.package_one.com.dawidgalziewski.Main
    // package is a namespace that organizes a set of related types
    // package structure is hierarchical
    // common practice is to name package as all lower case letters, divided by period when it comes to hierarchy i.e java.lang
    // also it is common to use reverse domain name as package names i.e if our domain is company.com package name would be com.company

    // classes allow us to oganize classes by functionality or relationship as well as encapsulate our classes from classes in other packages
    public static void main(String[] args) {
        // interesting thing is we can use FQCN INSTEAD of imports
        java.util.Scanner scanner = new java.util.Scanner(System.in); // redundant but it works!
        Pikatchu pp = new Pikatchu("Andy"); // imported class name
        pp.ExitPokeBall();
    }
}