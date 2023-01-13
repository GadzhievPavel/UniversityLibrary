package student;

import library.Book;
import library.ReaderTicket;

import java.util.HashSet;
import java.util.Iterator;

public class Student {
    String name;
    String lastName;
    int numberGroup;
    ReaderTicket readerTicket;

    public Student(String name, String lastName, int numberGroup){
        this.name = name;
        this.lastName = lastName;
        this.numberGroup = numberGroup;
        this.readerTicket = new ReaderTicket(this);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public ReaderTicket getReaderTicket() {
        return readerTicket;
    }

    public HashSet<Book> getBooks(){
        return getReaderTicket().getBooks();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("У студента ").append(getName()).append("из группы ").append(getNumberGroup()).append("на руках книги:\n");
        HashSet<Book> books = getBooks();
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()){
            Book book = iterator.next();
            builder.append(book.toString());
        }
        return builder.toString();
    }
}
