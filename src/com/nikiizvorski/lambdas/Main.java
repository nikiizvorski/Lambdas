package com.nikiizvorski.lambdas;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Instant;
import java.util.*;

public class Main {

    //Method Using Anonymous Class
    public static void usingAnonymouslineCLass() {
        List<Book> books = Books.all();
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getTitle().compareTo(b2.getTitle());
            }
        });

        for (Book book : books) {
            System.out.println(book);
        }

    }

    //Method Using Lambdas in Long Form
    public static void usingLambdasInLongForm() {
        List<Book> books = Books.all();
        Collections.sort(books, (Book b1, Book b2) -> {
            return b1.getTitle().compareTo(b2.getTitle());
        });

        for (Book book : books) {
            System.out.println(book);
        }

    }

    //Method Using Lambdas in Short Form
    public static void usingLambdasInShortForm() {
        List<Book> books = Books.all();
        Collections.sort(books, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
        books.forEach(book -> System.out.println(book));

    }

    //Method Using Lambdas in Short Form with Expressions
    public static void usingLambdasInShortFormExpressions() {
        List<Book> books = Books.all();
        Collections.sort(books, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
        books.forEach(System.out::println);

    }

    //Method Using Method Expression
    public static void usingMethodReferences() {
        List<Book> books = Books.all();
        Collections.sort(books, Comparator.comparing(Book::getTitle));
        books.forEach(System.out::println);

    }

    public static void main(String[] args) {
        usingLambdasInShortForm();
    }
}
