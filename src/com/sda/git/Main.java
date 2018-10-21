package com.sda.git;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Wiktor", "Syganiec", 37);
        User user2 = new User("Jacek", "Placek", 28);
        User user3 = new User("Agata", "Wymiata", 40);

        List<User> user = new ArrayList<>();

        user.add(user1);
        user.add(user2);
        user.add(user3);

        for (User name: user){
            System.out.println("imie: " + name.getName());
        }

        for (User lastname: user){
            System.out.println("lastname: " + lastname.getLastname());
        }

        for (User age: user){
            System.out.println("age: " + age.getAge());
        }
    }

}
