package com.example.alphabetsappselfb

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LetterDetailActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letter_detail)

        val letter = intent.getStringExtra("Letter")

        val letterTextView: TextView = findViewById(R.id.text_letter)
        val descriptionTextView: TextView = findViewById(R.id.text_description)
        val backButton: Button = findViewById(R.id.button_back)

        letterTextView.text = letter
        descriptionTextView.text = when (letter) {
            "A" -> "A is for Apple"
            "B" -> "B is for Ball"
            "C" -> "C is for Cat"
            //Add description for other letters
            "Z" -> "Z is for Zebra"
            else -> "Letter not found"
        }

        backButton.setOnClickListener {
            finish()
        }
    }
}