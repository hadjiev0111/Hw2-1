package com.company;

public final class ObjectС extends ObjectB{

    public ObjectС(int year, String name, Amir amir, Colors objectE) {
        super(year, name, amir, objectE);
    }



    @Override
    public void method() {
        System.out.println("Hello from ObjectC!!!");
    }
}
