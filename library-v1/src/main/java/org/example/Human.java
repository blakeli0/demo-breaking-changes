package org.example;

import java.util.Collection;
import java.util.List;

public class Human extends Mammal{
    @Override
    public void eat(List<String> food) {
        drink(List.of("soda"));
        super.eat(food);
    }

    @Override
    public void eat(Collection<String> food) {
        super.eat(food);
    }

    @Override
    public void run() {
        System.out.println("running...");
    }

    public void work() {
        System.out.println("10 hours of work...");
    }

    void drink(List<String> drinks) {
        System.out.println("drinking...");
    }

    public void sleep() {
        System.out.println("sleeping...");
    }

    public void stand() {

    }
}
