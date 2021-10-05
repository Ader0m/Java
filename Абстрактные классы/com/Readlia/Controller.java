package com.Readlia;

import java.util.ArrayList;

public class Controller {
    public static void main(String[] args) {
        Library library = new Library();
        Properties.loadProperties();
    }

    public void netToLocal(Library library_value, int userChoose) { //добвление книги в лок библиотеку из сетевой
        Book localBook;
        localBook = library_value.getLocalBooks(userChoose);
        library_value.addBook(localBook);
    }
}
