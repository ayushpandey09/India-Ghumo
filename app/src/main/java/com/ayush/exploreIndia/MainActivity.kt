package com.ayush.exploreIndia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.ayush.myapplication.R

class MainActivity : AppCompatActivity() {
    lateinit var btnExplore : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnExplore = findViewById(R.id.btnExplore)
        btnExplore.setOnClickListener {
            Toast.makeText(this,"Explore India",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}