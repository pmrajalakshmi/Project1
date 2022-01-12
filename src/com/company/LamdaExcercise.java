package com.company;
import java.util.*;

class Animal{
    private String species;
    private boolean canHop;
    private boolean canSwim;
    public Animal(String speciesName, boolean hopper, boolean swimmer)
    {
        species = speciesName;
        canHop = hopper;
        canSwim =swimmer;
    }
    public boolean canHop(){return canHop;}
    public boolean canSwim(){return canSwim;}
    public String toString(){return species.toString();}
}
interface CheckTrait{
   // public boolean testSwim(Animal a);
    public boolean testHop(Animal a);
}
class CheckIfHopper implements CheckTrait{
    public boolean testHop(Animal a){
        return a.canHop();
    }
   /* public boolean testSwim(Animal a){
        return a.canSwim();
    }
*/
}
public class LamdaExcercise{
    public static void main(String[] args){

        System.out.println("this future added by muru");

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish",false,true));
        animals.add(new Animal("Kangaroo",true,false));
        animals.add(new Animal("rabbit", true,false));
        animals.add(new Animal("turtle",false,true));
        animals.add(new Animal("frog", true,false));
        animals.add(new Animal("Dholphin",false,false));

        //printSwimmers(animals,new CheckIfHopper());
        //printHoppers(animals, new CheckIfHopper());
        System.out.println("Hoppers...");
        print(animals, a -> a.canHop());
        System.out.println("Swimmers...");
        print(animals, a -> !a.canHop());

    }
   /* private static void printSwimmers(List<Animal> animals, CheckTrait checker)
    {
        System.out.println("Swimmers...");
        for(Animal animal:animals){
            if(checker.testSwim(animal))
                System.out.println(animal + " ");

        }
    }
    private static void printHoppers(List<Animal> animals, CheckTrait checker)
    {
        System.out.println("Hoppers...");
        for(Animal animal:animals){
            if(checker.testHop(animal))
                System.out.println(animal + " ");

        }
    }*/
    private static void print(List<Animal> animals, CheckTrait checker)
    {
        for(Animal animal:animals){
            if(checker.testHop(animal))
                System.out.println(animal + " ");

        }
    }
}
