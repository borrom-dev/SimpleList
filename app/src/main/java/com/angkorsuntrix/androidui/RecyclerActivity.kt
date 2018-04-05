package com.angkorsuntrix.androidui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        list_books.layoutManager = LinearLayoutManager(this)
        list_books.adapter = BooksAdapter(Utils.getBooks(this))
    }
}
