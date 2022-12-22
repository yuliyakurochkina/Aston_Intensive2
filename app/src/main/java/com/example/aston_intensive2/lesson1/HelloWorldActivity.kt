package com.example.aston_intensive2.lesson1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.aston_intensive2.MainActivity
import com.example.aston_intensive2.databinding.ActivityHelloworldBinding

class HelloWorldActivity : AppCompatActivity() {

    private lateinit var binding1: ActivityHelloworldBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding1 = ActivityHelloworldBinding.inflate(layoutInflater)
        val view = binding1.root
        setContentView(view)
        Log.d("MainActivity", "Hello World")
        Log.e("MainActivity", "Happy Birthday to")
        Log.i("MainActivity", "MainActivity layout is complete")

        val intentMainActivity = Intent(this, MainActivity::class.java)

        binding1.btnForMainActivity.setOnClickListener {
            startActivity(intentMainActivity)
        }

    }
}
