class OOPS{
    public static void main(String args[]){
        Bear b = new Bear();
        b.eatsGrass();
        b.eatsFlesh();
    }
}

interface Carnivore{
    void eatsGrass();
}

interface Herbivore{
    void eatsFlesh();
}

class Bear implements Herbivore, Carnivore{
    public void eatsGrass(){
        System.out.println("Bear eats grass");
    }
    public void eatsFlesh(){
        System.out.println("Bear eats Flesh");
    }
}