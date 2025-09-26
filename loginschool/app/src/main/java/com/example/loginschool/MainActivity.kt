package com.example.loginschool

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // we’ll create this XML below

        // Example: show welcome message
        val textView = findViewById<TextView>(R.id.tvWelcome)
        textView.text = "Welcome, you are logged in!"
    }
}
