package com.kodilla;

import java.util.*;

class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int hashCode(){
        return year;
    }

    public boolean equals(Object o) {
        if (o != null) {
            if (o instanceof Book) {
                Book b = (Book) o;
                if ((b.getTitle() == null && title == null || b.getTitle().equals(title))
                        && (b.getAuthor() == null && author == null || b.getAuthor().equals(author))
                        && (b.getYear() == year)) {
                    return true;
                }
            }
        }
        return false;
    }
    public String toString(){
        return title + ", " + author + ", " + year;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }
}
class HashBook {
    public static void main (String[] args) throws java.lang.Exception {
        Book book1 = new Book("50 shades of Grey",null, 1987);
        Book book2 = new Book("The Last Mohikan", "Jennifer Bad", 2000);
        Book book3 = new Book(null, "Tom Kill", 2009);
        Book book4 = new Book("The Last Mohikan", "Jennifer Bad", 2000);

        Set<Book> bookSet = new HashSet<Book>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);

        for(Book theBook: bookSet){
            if(theBook.getYear() < 2010){
                System.out.println(theBook);
            }
        }
        System.out.println(book2.equals(book4));
    }
}