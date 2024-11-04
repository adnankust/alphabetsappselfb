package com.example.alphabetsappselfb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        findViewById<Button>(R.id.button_a).setOnClickListener { openLetterDetail("A") }
        findViewById<Button>(R.id.button_b).setOnClickListener { openLetterDetail("B") }
        findViewById<Button>(R.id.button_c).setOnClickListener { openLetterDetail("C") }
        findViewById<Button>(R.id.button_d).setOnClickListener { openLetterDetail("D") }
    }

    private fun openLetterDetail(letter: String) {
     val intent = Intent(this, LetterDetailActivity::class.java).apply {
         putExtra("Letter", letter)
     }
        startActivity(intent)
    }
}