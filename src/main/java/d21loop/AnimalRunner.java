package d21loop;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark(); //Dogs bark...
        d.feedWithMilk(); // Mammals feed their babies with milk...
        d.drink(); //Animals is Drink....
        d.eat(); //Animals is Eat override oncesindeki cikti  // Dogs is Eat bu cikti override isleminden sonraki cikti

        Bird b = new Bird();
        b.tweet(); //Brid tweet....
        b.eat(); //Animals is Eat

        Cat c = new Cat();
        c.feedWithMilk(); // Cats feed their babies with milk...


    }
}
