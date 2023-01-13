package org.example;

import library.Book;
import library.Library;
import student.Student;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Вова","Пупкин",633);
        Book book = new Book(1,"Война и мир","Толстой");
        Book book1 = new Book(2,"Война и мир","Толстой");
        HashSet<Book> books = new HashSet<Book>( Arrays.asList(book,book1));
        Library library = new Library(books);
        System.out.println(library.getCurrentBooks());

        library.getBook(student,1,8);
        System.out.println(library.getCurrentBooks());
        System.out.println(student.toString());

    }
}