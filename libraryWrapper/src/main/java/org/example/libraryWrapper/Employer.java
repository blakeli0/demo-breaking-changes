package org.example.libraryWrapper;

import org.example.Human;

import java.util.List;

public class Employer {
    private final Human employee1 = new Human();
    private final Human employee2 = new Human();

    public void makeMoney() {
        //this method is linked to eat(List<String>) in v1 but linked to eat(Collection<String>) in v2
        employee1.eat(List.of("apple", "burger"));
        //this method is changed to static in v2
//        employee1.sleep();
        employee1.drink(List.of("soda"));

        employee2.work();
        //this method does not exist in v2
//        employee.stand();
    }
}
