package student;

import library.ReaderTicket;

public class Student {
    String name;
    String lastName;
    int numberGroup;
    ReaderTicket readerTicket;

    public Student(String name, String lastName, int numberGroup){
        this.name = name;
        this.lastName = lastName;
        this.numberGroup = numberGroup;
        this.readerTicket = null;
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

}
