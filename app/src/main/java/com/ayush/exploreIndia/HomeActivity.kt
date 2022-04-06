package com.ayush.exploreIndia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import android.widget.Toast
import com.ayush.myapplication.R

class HomeActivity : AppCompatActivity() {
    lateinit var searchbar : SearchView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        searchbar = findViewById(R.id.searchView)
        searchbar.setOnClickListener {
            Toast.makeText(this,"Search!!", Toast.LENGTH_SHORT).show()
        }
    }
}