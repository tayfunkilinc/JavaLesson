package d21loop;

public class Cat extends Mammal { //Cat extends ile Mammaldan miras aldı
    public void meow(){
        System.out.println("Cats meow .....");
    }

    @Override
    public void feedWithMilk() {
        System.out.println("Cats feed their babies with milk...");
    }
}
