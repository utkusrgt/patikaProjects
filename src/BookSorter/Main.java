package BookSorter;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int b;

        Scanner inp = new Scanner(System.in);


            System.out.println("For A-Z press 0 :  ");
            System.out.println("For Page count press 1 :  ");
            System.out.print("Please enter the filtre type : ");
            b = inp.nextInt();

        while (true){
            if (b == 1){
                System.out.println("Books are sorted by Page Count");
                Set<Book> books = new TreeSet<>(new Sort());


                books.add(new Book("Beyond the Stars", "Y. DEAN", 1991, 2156));
                books.add(new Book("Quest for the Unknown", "J. HARMON", 1992, 248));
                books.add(new Book("Galactic Explorers", "S. COLE", 1993, 3));
                books.add(new Book("Lost in Time and Space", "C. SANDOVAL", 1994, 45646));
                books.add(new Book("Alien Encounter", "B. BELL", 1995, 415));

                for (Book book : books){

                    System.out.println(book);
                    System.out.println("--------------------------");

                }

            }else if(b == 0) {
                System.out.println("Books are sorted by A-Z");
                Set<Book> books = new TreeSet<>();


                books.add(new Book("Beyond the Stars", "Y. DEAN", 1991, 2156));
                books.add(new Book("Quest for the Unknown", "J. HARMON", 1992, 248));
                books.add(new Book("Galactic Explorers", "S. COLE", 1993, 3));
                books.add(new Book("Lost in Time and Space", "C. SANDOVAL", 1994, 45646));
                books.add(new Book("Alien Encounter", "B. BELL", 1995, 415));

                for (Book book : books){

                    System.out.println(book);
                    System.out.println("--------------------------");

                }

            }else{
                System.out.println("Invalid Filter");
            }
            break;

        }







    }



}
