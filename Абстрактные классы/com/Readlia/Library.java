package com.Readlia;
import java.util.ArrayList;
public class Library 
{
          String setPathBook = Properties.getPathBook();

          private ArrayList<Book> LocalBooks = new ArrayList<>();
          private ArrayList<Book> NetBooks = new ArrayList<>();

          //добавление книги в локальную библиотеку из сетевой
          public void AddBook(Book b) {
                    Book temp = b;
                    temp.setPathBook(setPathBook);
                    LocalBooks.add(temp);
          }
          //удаление книги из локальной бибилиотеки
          public void DeleteBook(Book b){
                    LocalBooks.remove(b);
                    
          }
          //подгрузка книг из базы данных в сетевую бибилиотеку
          public void AddNetBook(){
                    
          }
          
 }
