package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        Book a = bookManager.createBook("Una","Big");

        Book b = new Book("Uno","Bag");
        bookManager.createBook(b);

        Book c = bookManager.createBook("Una","Big");


        System.out.println(a.equals(c));
        System.out.println(a.hashCode());
        System.out.println(c.hashCode());
        System.out.println(a==c);
        System.out.println("---------------");
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a==b);




    }
}
