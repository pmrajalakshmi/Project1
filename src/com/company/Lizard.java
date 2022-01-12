package com.company;
// class design

class Reptile{
    {
        System.out.println("A");
    }
    public Reptile(int hatch){}
   void layEggs()
    {
        System.out.println("Reptile");
    }
}
public class Lizard extends Reptile{
    static {
        System.out.println("B");
    }
    public Lizard(int hatch){
        super(hatch);
    }
    public  void layEggs(){
        System.out.println("Lizard");
    }
    public static void main(String[] args)
    {
        Reptile reptile= new Lizard(1);
        reptile.layEggs();
    }
}
/*Question 21


class Bird{
    int feathers=0;
    Bird(int x){
        this.feathers=x;
    }
    Bird fly(){
        return new Bird(1);
    }
}
class Parrot extends Bird{
    int feathers=0;

    Parrot(int y){super(2);
    this.feathers=y;
    }
    Parrot fly(){
        return new Parrot(2);
    }
}
public class Maccaw extends Parrot{
    int feathers=0;
    public Maccaw(int z){super(z);
    this.feathers=z;
    }
    public Maccaw fly(){
        System.out.println("I am in macaw");
        return new Maccaw(3);
    }
    public static void main(String... sing){
        Bird p= new Maccaw(4);
        System.out.println(p.feathers);
        System.out.println(((Parrot)p.fly()).feathers);
        System.out.println(((Bird)p.fly()).feathers);
        System.out.println(((Maccaw)p.fly()).feathers);
        System.out.println((p.fly()).feathers);
    }
}
*/

/*question 22
class Person {
    static String name;

    void setName(String q) {
        name = q;
    }
}

public class Main extends Person {
    static String name;

    void setName(String q) {
        name = q;
    }

    public static void main(String[] p) {
        final Main m = new Main();
        System.out.println(m.name);
        final Person t = m;
        System.out.println(m.name + " " + t.name);
        m.name = "Elysia";
        t.name = "Sophia";
        System.out.println(m.name + " " + t.name);
        m.name = "Webby";
        t.name = "Olivia";
        System.out.println(m.name + " " + t.name);
    }

}*/
/* question 26
class Primate{
    protected int age=2;
    {age=1;}
    public Primate(){
        this.age =3;
    }

}
public class Main extends Primate{
    protected int age=4;
    {age=3;}
    public Main(){
        this.age = 6;
    }
    public static void main(String[] args){
        final Primate x=(Primate)new Main();
        System.out.println(x.age);

    }
}*/
/*  question 25
class Antelope{
    public Antelope(int p){
        System.out.println("inside constructor");
        print();
    }
    {
        System.out.println("Initialisation in Antelope");
    }
    static {
        System.out.println("static block in Antelope");
    }
    private void print(){
        System.out.println("private method, called in Antelope constructor");
    }
}

public class Main  extends Antelope{

public Main(int p){
    super(6);
    System.out.println("Constuctor in Main");
}
    public static void main(String[] args) {
        System.out.println("Hello");
        new Main(0);
        System.out.println("exit in Main");
    }
    static {
        System.out.println("Static block in Main");
    }
    {
        System.out.println("Initialisation block in Main");
    }
}*/


