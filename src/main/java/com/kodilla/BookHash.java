package com.kodilla;

import java.util.*;

class Books {
    String title;
    String author;
    int year;

    public Books(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int hashCode(){
        return year;
    }

    public boolean equals(Object o){
        Book b = (Book) o;
        return (title.equals(b.getTitle())) && (author.equals(b.getAuthor())) && (year == b.getYear());
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
class BookHash {
    public static void main (String[] args) throws java.lang.Exception {
        Books book1 = new Books("50 shades of Grey", "Steven Taylor", 1987);
        Books book2 = new Books("The Last Mohikan", "Jennifer Bad", 2000);
        Books book3 = new Books("The infinity", "Tom Kill", 2010);
        Books book4 = new Books("The in", "Tom Jones", 1988);
        Books book5 = new Books("finity", "Gregory Kill", 1999);

        Deque<Books> theBooks = new ArrayDeque<Books>();

        theBooks.push(book1);
        theBooks.push(book2);
        theBooks.push(book3);
        theBooks.push(book4);
        theBooks.push(book5);

        System.out.println("Number of books: " + theBooks.size());

        Books temporaryBook;
        temporaryBook = theBooks.pop();
        temporaryBook = theBooks.pop();
        temporaryBook = theBooks.pop();
        temporaryBook = theBooks.pop();
        temporaryBook = theBooks.pop();

        System.out.println();
        System.out.println("All books are removed. Number of books: " + theBooks.size());
        System.out.println();
        System.out.println("Last book removed from set was:\n" + temporaryBook);
        System.out.println();
    }
}