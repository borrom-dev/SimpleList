package com.angkorsuntrix.androidui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by borrom on 4/5/18.
 */

public class BooksListAdapter extends BaseAdapter {

    private List<Book> mBooks = new ArrayList<>();

    public BooksListAdapter(List<Book> books) {
        mBooks = books;
    }

    @Override
    public int getCount() {
        return mBooks.size();
    }

    @Override
    public Book getItem(int position) {
        return mBooks.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.view_basic_item, parent, false);
        }
        bind(convertView, position);
        return convertView;
    }

    private void bind(View root, int position) {
        Book book = mBooks.get(position);
        TextView title = root.findViewById(R.id.title);
        TextView author = root.findViewById(R.id.author);
        TextView rate = root.findViewById(R.id.rate);
        title.setText(book.getTitle());
        author.setText(book.getAuthor());
        rate.setText(String.valueOf(book.getRate()));

    }
}
