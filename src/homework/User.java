package homework;

import java.util.HashMap;

import homework.impl.Persister;

public class User implements Persister {
    private final String name;
    public HashMap<Integer, String> users;
    public int count;

    public User(String name){
        this.name = name;
        this.users = new HashMap<>();
    }

    public String getName(){
        return name;
    }

    @Override
    public void save() {
        users.put(count, name);
        count++;
        System.out.println("User saved: " + name);
    }

    @Override
    public HashMap<Integer, String> getUsers(){
        return users;
    }

    // public void getUsers() {
    //     System.out.println(reports);
    // }
}
