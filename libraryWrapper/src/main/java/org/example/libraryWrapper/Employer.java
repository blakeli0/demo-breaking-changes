package org.example.libraryWrapper;

import org.example.Human;

import java.util.List;

public class Employer {
    private final Human manager = new Human();
    private final Human employee = new Human();

    public void makeMoney() {
        //this method is linked to eat(List<String>) in v1 but linked to eat(Collection<String>) in v2
        manager.eat(List.of("apple", "burger"));
        //this method is changed to static in v2
//        manager.sleep();

        manager.work();
        manager.run();

        employee.work();
        //this method does not exist in v2
//        employee.stand();
    }
}
