package library;

import java.util.Objects;

public class Book {
    private Integer id;
    private String name;
    private String author;

    public Book(int id, String name, String author){
        this.id = id;
        this.name = name;
        this.author = author;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book){
            return this.id.equals(((Book) obj).id);
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
