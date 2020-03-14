package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        BookManager a = new BookManager("Una", "Beck");
        BookManager b = new BookManager("Baba", "Snack");
        BookManager c = new BookManager("Una", "Beck");

        System.out.println(a.equals(c));
        System.out.println(a.hashCode());
        System.out.println(c.hashCode());
        System.out.println(a==c);

        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a==b);




    }
}
