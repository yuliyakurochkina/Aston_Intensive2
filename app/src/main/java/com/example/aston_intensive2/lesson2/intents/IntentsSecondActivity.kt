package com.example.aston_intensive2.lesson2.intents

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aston_intensive2.R
import com.example.aston_intensive2.lesson2.intents.IntentsActivity.Companion.EXTRA_MESSAGE
import com.example.aston_intensive2.databinding.ActivityIntentsSecondBinding

class IntentsSecondActivity : AppCompatActivity(R.layout.activity_intents_second) {

    private lateinit var binding2: ActivityIntentsSecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityIntentsSecondBinding.inflate(layoutInflater)
        val view = binding2.root
        setContentView(view)

        val dataSecondScreen = intent.getStringExtra(EXTRA_MESSAGE)
        val intent = Intent(this, IntentsActivity::class.java)

        with(binding2) {
            btnBack.setOnClickListener {
                startActivity(intent)
            }
            tvDataSecondScreen.text = dataSecondScreen
        }
    }
}
