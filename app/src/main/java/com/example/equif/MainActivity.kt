package com.example.equif

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the Next button by its ID
        val nextButton: Button = findViewById(R.id.button)
        nextButton.setOnClickListener {
            navigateToNextActivity()
        }
    }

    private fun navigateToNextActivity() {
        val intent= Intent(this,NextActivity::class.java)
        startActivity(intent)
        finish()
    }

}
