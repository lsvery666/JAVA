package com.oop.params;

public class _03_PassParams {
    public static void main(String[] args) {
        _03_PassParams pt = new _03_PassParams();

        String name = "Hollis";
        pt.pass(name);
        System.out.println("print in main , name is " + name);
    }

    public void pass(String name) {
        name = "hollischuang";
        System.out.println("print in pass , name is " + name);
    }
}
