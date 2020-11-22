package Animals_HW5;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<HomeAnimals> list = new ArrayList<>();
        list.add(new Cat("Tom"));
        list.add(new Dog("Jim"));
        list.add(new Hamster("Cap"));
        list.add(new Fish("Dolly"));
        list.add(new GuideDog("Bill"));
        for (HomeAnimals animals: list) {
            System.out.println(animals.voice());
        }
        List<WildAnimals> list1 = new ArrayList<>();
        list1.add(new Croco(true));
        list1.add(new Giraffe(false));
        list1.add(new Lion(true));
        list1.add(new Wolf(true));
        for (WildAnimals wild: list1) {
            System.out.println(wild.voice());
        }
    }
}







