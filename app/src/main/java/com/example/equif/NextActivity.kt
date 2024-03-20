package com.example.equif

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val nextButton: Button = findViewById(R.id.button2)
        nextButton.setOnClickListener {
            navigateToNextActivity2()


        }
    }

    private fun navigateToNextActivity2() {
        val intent = Intent(this, NextActivity2::class.java)
        startActivity(intent)
        finish()
    }
}