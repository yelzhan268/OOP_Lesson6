package homework.impl;

import java.util.HashMap;

import homework.User;

public class Report <E extends User> {

    private final HashMap<Integer, String> users;

    public Report(E users) {
        this.users = new HashMap<>();
    }

    public void report() {

        System.out.println(users);
    }
}
