package org.example;

import java.util.Collection;
import java.util.List;

public class Human extends Mammal {
//    @Override
//    public void eat(List<String> food) {
//        drink(List.of("soda"));
//        super.eat(food);
//    }

    @Override
    public void eat(Collection<String> food) {
        super.eat(food);
    }

    void drink(Collection<String> drinks) {
        System.out.println("drinking...");
    }

    public static void sleep() {
        System.out.println("sleeping...");
    }

    //only exists in v2
    public void doubleWork() {
        work();
        work();
    }

}
