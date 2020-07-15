package com.company;

public class Main {

    public static void main(String[] args) {
        Amir amir = new Amir("Krasavchik)");
        ObjectB objectA = new ObjectB(10,"ObjectB_1",amir, Colors.BLACK);

        ObjectС objectB = new ObjectС(7, "ObjetcC_1",amir, Colors.WHITE);
        ObjectС objectC = new ObjectС(5, "Hi",amir,Colors.GRAY);
        System.out.println("Year - " + objectA.getYear()+ "\nName - "+ objectA.getName()+
                "\nAmir - "+ amir.getString()+"\nColor - "+ objectA.getColors());

        System.out.println("Year - " + objectB.getYear()+ "\nName - "+ objectB.getName()+
                "\nAmir - "+ amir.getString()+"\nColor - "+ objectB.getColors());

        System.out.println("Year - " + objectC.getYear()+ "\nName - "+ objectB.getName()+
                "\nAmir - "+ amir.getString()+"\nColor - "+ objectC.getColors());
    }
}
