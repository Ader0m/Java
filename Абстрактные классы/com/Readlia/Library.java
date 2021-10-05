package com.Readlia;
import java.util.ArrayList;
public class Library 
{
    String setPathBook = Properties.getPathBook();

    private ArrayList<Book> LocalBooks = new ArrayList<>();
    private ArrayList<Book> NetBooks = new ArrayList<>();

    public Book getLocalBooks(int userChoose) {
        return LocalBooks.get(userChoose);
    }
    public void setLocalBooks(ArrayList<Book> localBooks) {
        LocalBooks = localBooks;
    }
    public ArrayList<Book> getNetBooks() {
        return NetBooks;
    }
    public void setNetBooks(ArrayList<Book> netBooks) {
        NetBooks = netBooks;
    }

    //добавление книги в локальную библиотеку из сетевой
    public void addBook(Book b) {
            Book temp = b;
            temp.setPathBook(setPathBook + "/" + b.getTitle());
            LocalBooks.add(temp);
    }
    //удаление книги из локальной бибилиотеки
    public void deleteBook(Book b){
            LocalBooks.remove(b);
    }
    //подгрузка книг из базы данных в сетевую бибилиотеку
    public void addNetBook(){

    }
 }
