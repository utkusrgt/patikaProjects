package BookSorter;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.*;

public class Book implements Comparable<Book> {

    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }

    public String toString(){
        return getName() +"  "+ getAuthor() + "  " + getPublishDate() + "  " + getPageCount();
    }



    String name;
    String author;
    int publishDate;
    int pageCount;

    public Book(String name, String author, int publishDate, int pageCount) {
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
        this.pageCount = pageCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
