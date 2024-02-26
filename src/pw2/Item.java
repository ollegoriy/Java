package pw2;

import java.util.Scanner;

public class Item {
    private int id;
    private String name;
    private double price;

    public Item() {

    }

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
        this.price = 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Название: " + name);
        System.out.println("Цена: " + price);
    }

    public static void main(String[] args) {
        Item[] store = new Item[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 10 товаров:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите ID:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Введите название:");
            String name = scanner.nextLine();
            System.out.println("Введите цену:");
            double price = scanner.nextDouble();
            store[i] = new Item(id, name, price);
        }

        System.out.println("Товары в магазине:");
        for (Item obj : store) {
            obj.displayDetails();
        }
    }
}