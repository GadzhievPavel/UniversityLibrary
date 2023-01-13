package library;

import student.Student;

import java.util.HashSet;

public class ReaderTicket {
    private int number;
    private Student student;
    private HashSet<Book> books;

    public ReaderTicket(Student student){
        books= new HashSet<>();
        this.student = student;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public HashSet<Book> getBooks(){
        return books;
    }
}
