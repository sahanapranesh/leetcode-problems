package com.java.features;

public class DemoImpl implements DemoInterface{
    @Override
    public String getName() {
        return "Name is Aashvi";
    }

    public static void main(String[] args) {
        DemoInterface demoInterface = new DemoImpl();
        System.out.println(demoInterface.getName());
        System.out.println(demoInterface.getAge());
        System.out.println(DemoInterface.getDate());
    }
}
