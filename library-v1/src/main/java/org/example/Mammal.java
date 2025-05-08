package org.example;

import java.util.Collection;
import java.util.List;

public abstract class Mammal implements Animal{
    @Override
    public void eat(List<String> food) {
        food.forEach(f -> System.out.println("Ate: " + f));
    }

    @Override
    public void eat(Collection<String> food) {
        food.forEach(f -> System.out.println("Ate: " + f));
    }

    public static void drink(List<String> drinks) {
        System.out.println("drinking...");
    }

    protected void walk() {
        System.out.println("walking");
    }
    public abstract void run();
}
