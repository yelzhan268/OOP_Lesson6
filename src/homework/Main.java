package homework;

import dip1.model.Report;
import homework.impl.Persister;

public class Main{
    public static void main(String[] args){
        User user1 = new User("Bob");
        user1.save();
        User user2 = new User("Sasha");
        user2.save();
        Report report = new Report();
        report.getReport();
    }
}