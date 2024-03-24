package homework;


public class Main{
    public static void main(String[] args){
        User user1 = new User("Bob");
        user1.report();
        user1.save();
        User user2 = new User("Sasha");
        user2.report();
        user2.save();
    }
}