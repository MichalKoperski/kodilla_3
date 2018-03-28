package com.kodilla;

import java.util.*;

class Book4 {
    String title;
    String author;

    public Book4(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public int hashCode() {
        String firstLetter = this.title.substring(0,0);
        if(firstLetter=="B") {
            return 1;
        } else {
            return 2;
        }
    }
    public boolean equals(Object o) {
        Book4 b = (Book4) o;
        return (title.equals(b.getTitle())) && (author.equals(b.getAuthor()));
    }
    public String toString(){
        return title + ", " + author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
}
class CountTime {
    public static void main (String[] args) throws java.lang.Exception {

        List<Book4> library = new LinkedList<Book4>();

        for(Integer i = 0; i<5000000; i++) {
            library.add(new Book4("Some Book", "Tom"));
        }
        long begin = System.nanoTime();
        library.remove(0);
        long end = System.nanoTime();
        System.out.println("Removing 1st entry from LinkedList took: "+(end-begin)+ " ns");

        long begin2 = System.nanoTime();
        library.remove(library.size()-1);
        long end2 = System.nanoTime();
        System.out.println("Removing last entry from LinkedList took: "+(end2-begin2)+" ns");

        long begin3 = System.nanoTime();
        library.add(0, new Book4("Extra Book", "X"));
        long end3 = System.nanoTime();
        System.out.println("Inserting 1st entry to LinkedList took: "+(end3-begin3)+" ns");

        long begin7 = System.nanoTime();
        library.add(library.size()-1, new Book4("Super", "AA"));
        long end7 = System.nanoTime();
        System.out.println("Inserting last entry to LinkedList took: "+(end7-begin7)+" ns");

        Map<Book4, Integer> marksTable = new HashMap<Book4, Integer>();
        for(int i = 0; i<4000000; i++){
            marksTable.put(new Book4("BB", "VV"), i);
        }
        long begin4 = System.nanoTime();
        marksTable.put(new Book4("zz", "cc"), 6);
        long end4 = System.nanoTime();
        System.out.println("Inserting last entry to HashMap took: "+(end4-begin4)+" ns");

        long begin6 = System.nanoTime();
        marksTable.remove(0);
        long end6 = System.nanoTime();
        System.out.println("Removing first entry from HashMap took: "+(end6-begin6)+" ns");

        long begin5 = System.nanoTime();
        for(Map.Entry<Book4, Integer> entry: marksTable.entrySet()) {
            if(entry.getKey().getTitle()=="zz") {
                System.out.println(entry.getValue());
            }
        }
        long end5 = System.nanoTime();
        System.out.println("Searching in HashMap took: "+(end5-begin5)+" ns");
    }
}