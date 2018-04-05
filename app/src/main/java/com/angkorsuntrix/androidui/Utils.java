package com.angkorsuntrix.androidui;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by borrom on 4/5/18.
 */

public class Utils {

    public static List<Book> getBooks(Context context) {
        List<Book> books = new ArrayList<>();
        String[] items = context.getResources().getStringArray(R.array.books);
        for (String item : items) {
            books.add(getBook(item));
        }
        return books;
    }

    private static Book getBook(String item) {
        String[] data = item.split(";", 3);
        Book book = new Book();
        book.setmTitle(data[0]);
        book.setmAuthor(data[1]);
        book.setmRate(Float.valueOf(data[2]));
        return book;
    }
}
