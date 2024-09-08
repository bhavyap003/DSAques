class OOPS{
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.walk();
        c.eat();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Horse{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
