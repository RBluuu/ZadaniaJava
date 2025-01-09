package com.java.course.com.lesson28_29.zadanienr1;

import com.java.course.com.lesson28_29.asocjacje.Grade;
import com.java.course.com.lesson28_29.asocjacje.Student;

import java.util.ArrayList;
import java.util.List;

public class Book {
    //id|tytul|cena|gatunek|id_autora
    //1,Krol Lew,20.00,przygodowa,1
    private int id;
    private String title;
    private int price;
    private String bookGenre;
    private Author author;

    public Book(int id, String title, int price, String bookGenre) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.bookGenre = bookGenre;
    }

    //znajdz ksiazke po id autora - dziala
    public static List<Book> ksiazkaPoIdAutora(List<Book> books, String idAutora) {
        List<Book> allBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.author.getId().equals(idAutora)) {
                allBooks.add(book);
            }
        }
        return allBooks;
    }

    //znajdz wszystkie ksiazki po nazwisku autora - dziala
    public static List<Book> allBooksAuthor(List<Book> books, String authorLastName) {
        List<Book> allBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.author.getLastName().equals(authorLastName)) {
                allBooks.add(book);
            }
        }
        return allBooks;
    }

    //znajdz ksiazki drozsze niz 30zl - dziala
    public static List<Book> priceMore30zl(List<Book> books,int priceBook) {
        List<Book> allBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.price > priceBook) {
                allBooks.add(book);
            }
        }
        return allBooks;
    }

    //znajdz ksiazki taniejsze niz 10zl - dziala
    public static List<Book> priceUnder10z(List<Book> books, int priceBook) {
        List<Book> allBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.price < priceBook) {
                allBooks.add(book);
            }
        }
        return allBooks;
    }

    //znajdz ksiazki w przedziale cenowym 10-20zl - dziala
    public static List<Book> priceRangeOfBooks(List<Book> books, double minPrice, double maxPrice) {
        List<Book> allBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.price > minPrice && book.price < maxPrice) {
                allBooks.add(book);
            }
        }
        return allBooks;
    }

    //znajdz najdrozsza ksiazke - dziala
    public static List<Book> mostExpensiveBook(List<Book> books) {
        List<Book> allBooks = new ArrayList<>();
        int price = Integer.MIN_VALUE;
        for (Book book : books) {
            if (book.price > price) {
                price = book.price;
                allBooks.add(book);
            }
        }
        return allBooks;
    }


    //znajdz najtansza ksiazke - POPRAWIC!!!
    public static List<Book> cheapestBook(List<Book> books) {
        List<Book> allBooks = new ArrayList<>();
        int price = Integer.MIN_VALUE;
        for (Book book : books) {
            if (book.price < price) {
                price = book.price;
                allBooks.add(book);
            }
        }
        return allBooks;
    }

    //znajdz autora ktory ma najwiecej ksiazek - działa
    public static Author mostPopulaAuthor(List<Author> authors) {
        Author mostBooks = null;
        int numberOfBooks = Integer.MIN_VALUE;
        for (Author author : authors) {
            if (author.getBooks().size() > numberOfBooks) {
                mostBooks = author;
                numberOfBooks = author.getBooks().size();
            }
        }
        return mostBooks;
    }

    //oblicz srednia cene ksiazek po gatunku - dziala
    public static double averagePriceOfGenre(List<Book> books, String genre) {
        int nummber = 0;
        double averagePrice = 0;
        for (Book book : books) {
            if (book.bookGenre.equals(genre)) {
                averagePrice += book.price;
                nummber++;
            }
        }
        return averagePrice / nummber;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", bookGenre='" + bookGenre + '\'' +
                ", idAuthor='" + author + '\'' +
                '}';
    }
}
