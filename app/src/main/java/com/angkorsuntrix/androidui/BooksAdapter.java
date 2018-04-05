package com.angkorsuntrix.androidui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by borrom on 4/5/18.
 */

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.ViewHolder> {

    private List<Book> mBooks;

    public BooksAdapter(List<Book> books){
        mBooks = books;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View root = inflater.inflate(R.layout.view_basic_item, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(mBooks.get(position));
    }

    @Override
    public int getItemCount() {
        return mBooks.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView author;
        private TextView rate;

        ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            author = itemView.findViewById(R.id.author);
            rate = itemView.findViewById(R.id.rate);
        }

        void bind(Book book){
            title.setText(book.getTitle());
            author.setText(book.getAuthor());
            rate.setText(String.valueOf(book.getRate()));
        }
    }
}
