package com.company;

public class MotherDuck {
    String noise="Quack";
    void quack(){
        System.out.println(noise);
    }
    private void makeNoise()
    {
        quack();
    }
}
