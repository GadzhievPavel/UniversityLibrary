package library;

import java.util.HashSet;

public class Journal {
    HashSet<ItemJournal> items;

    public Journal(){
        items = new HashSet<>();
    }

    public void addJournalItem(ItemJournal itemJournal){
        items.add(itemJournal);
    }

}
