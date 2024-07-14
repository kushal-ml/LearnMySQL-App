package com.example.assignment1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val learnButton: Button = findViewById(R.id.learnButton)
        val implementButton: Button = findViewById(R.id.implementButton)

        learnButton.setOnClickListener {
            val intent = Intent(this, LearnActivity::class.java)
            startActivity(intent)
        }

        implementButton.setOnClickListener {
            val intent = Intent(this, ImplementActivity::class.java)
            startActivity(intent)
        }
    }
}
