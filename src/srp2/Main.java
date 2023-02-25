package srp2;

import srp2.model.Order;

public class Main {
    public static void main(String[] args) {
        System.out.println("¬ведите заказ:");
        Order order = new Order("", "", 0, 0);
        order.inputFromConsole();
        order.saveToJson();
    }
}
