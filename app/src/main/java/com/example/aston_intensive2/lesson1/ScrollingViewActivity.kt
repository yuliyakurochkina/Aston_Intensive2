package com.example.aston_intensive2.lesson1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aston_intensive2.databinding.ActivityScrollingViewBinding

class ScrollingViewActivity : AppCompatActivity() {

    private lateinit var binding4: ActivityScrollingViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding4 = ActivityScrollingViewBinding.inflate(layoutInflater)
        val view = binding4.root
        setContentView(view)

    }
}