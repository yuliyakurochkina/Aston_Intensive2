package com.example.aston_intensive2.lesson1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aston_intensive2.MainActivity
import com.example.aston_intensive2.databinding.ActivityHelpYourselfBinding

class HelpYourSelfActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHelpYourselfBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelpYourselfBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intentMainActivity = Intent(this, MainActivity::class.java)

        binding.btnForMainActivity.setOnClickListener {
            startActivity(intentMainActivity)
        }

    }
}