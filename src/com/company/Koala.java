package com.company;

public class Koala {
    public static int count=10;

    public void eat(){
        System.out.println("Eat");
        drink();
    }
    public void drink()
    {
        System.out.println("Drink");
        comeOut();
    }
    public static void goHome(Koala k)
    {
        System.out.println("GoHome");
        k.eat();
    }
    public static void comeOut()
    {
        System.out.println("Come Out");
    }
}
