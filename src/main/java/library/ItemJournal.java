package library;

import java.time.LocalDateTime;
import java.util.Date;

public class ItemJournal {
    private ReaderTicket ticket;
    private Book book;
    private LocalDateTime date;
    int days;

    public ItemJournal(ReaderTicket ticket, Book book, LocalDateTime date, int days){
        this.ticket = ticket;
        this.book = book;
        this.date = date;
        this.days = days;
    }

    @Override
    public String toString() {
        return "ItemJournal{" +
                "ticket=" + ticket +
                ", book=" + book +
                ", date=" + date +
                ", days=" + days +
                '}';
    }
}
