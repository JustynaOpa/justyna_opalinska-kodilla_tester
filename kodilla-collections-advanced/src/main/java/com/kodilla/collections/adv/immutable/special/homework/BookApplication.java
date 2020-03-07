package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book a = new Book("Una","Beck");
        Book b = new Book("Baba", "Snack");
        Book c = new Book("Una", "Beck");

        System.out.println(a.equals(c));
        System.out.println(a==c);




    }
}
