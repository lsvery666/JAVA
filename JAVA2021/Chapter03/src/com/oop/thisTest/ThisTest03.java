package com.oop.thisTest;

public class ThisTest03 {
    public static void main(String[] args) {
        Manager m1 = new Manager("KING");
        Manager m2 = new Manager();
        m2.setName("FORD");
        System.out.println(m1.getName());
        System.out.println(m2.getName());
    }
}

class Manager {
    private String name;

    Manager() {
    }

    Manager(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
