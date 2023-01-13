package library;

import student.Student;
import sun.util.calendar.BaseCalendar;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Library {
    HashSet<Book> books = new HashSet<>();
    Journal journal;

    public Library(){
        journal = new Journal();
        books = new HashSet<>();
    }

    public Library(HashSet<Book> books){
        this.books = books;
        this.journal = new Journal();
    }

    public String getCurrentBooks(){
        StringBuilder builder = new StringBuilder();
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()){
            builder.append(iterator.next().toString());
            builder.append("\n");
        }
        return builder.toString();
    }

    public Book getBook(Student student, int id, int days){
        if(student.getReaderTicket()!= null){
            Iterator<Book> iterator = books.iterator();
            Book book = null;
            while (iterator.hasNext()){
                Book bookTemp = iterator.next();
                if(bookTemp.getId() == id){
                    book = bookTemp;
                    break;
                }
            }
            Date date = new Date();

            if(book!= null){
                ItemJournal itemJournal = new ItemJournal(student.getReaderTicket(), book, LocalDateTime.now(),days);
                journal.addJournalItem(itemJournal);
                books.remove(book);
                student.getReaderTicket().addBook(book);
            }
        }
        return null;
    }
}
