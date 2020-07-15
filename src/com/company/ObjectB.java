package com.company;

public class ObjectB extends ObjectА{
    public ObjectB(int year, String name, Amir amir, Colors objectE) {
        super(year, name, amir, objectE);
    }

    public void method(){
        System.out.println("Method");
    }
    public final void method(String string){
        System.out.println(string);
    }
}
