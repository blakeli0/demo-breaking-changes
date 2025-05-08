package org.example;

import java.util.Collection;
import java.util.List;

public abstract class Mammal
        implements Animal
{
    public static void drink(List<String> drinks) {
        System.out.println("drinking...");
    }

//    @Override
//    public void eat(List<String> food) {
//        food.forEach(f -> System.out.println("Ate: " + f));
//    }

    @Override
    public void eat(Collection<String> food) {
        food.forEach(f -> System.out.println("Ate: " + f));
    }

    public void run() {
        System.out.println("running...");
    }

    public void work() {
        System.out.println("10 hours of work...");
    }
}
