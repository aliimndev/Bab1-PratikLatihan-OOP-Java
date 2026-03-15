package Polymorphism;

class Hewan {
    public void suara() {
        System.out.println("Hewan membuat suara.");
    }
}

class Anjing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Anjing: Guk Guk!");
    }
}

class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Kucing: Meong!");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Hewan hewan1 = new Anjing(); // reference parent, object child
        Hewan hewan2 = new Kucing();

        hewan1.suara(); // runtime polymorphism
        hewan2.suara();
    }
}