package com.example.aston_intensive2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aston_intensive2.databinding.ActivityMainBinding
import com.example.aston_intensive2.lesson1.*
import com.example.aston_intensive2.lesson2.ImplicitIntentsActivity
import com.example.aston_intensive2.lesson2.LifecycleStateActivity
import com.example.aston_intensive2.lesson2.intents.IntentsActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intentToFirstScreen = Intent(this, HelloWorldActivity::class.java)
        val intentToSecondScreen = Intent(this, InteractiveUIActivity::class.java)
        val intentToThirdScreen = Intent(this, LayoutEditorActivity::class.java)
        val intentToFourthScreen = Intent(this, ScrollingViewActivity::class.java)
        val intentToFifthScreen = Intent(this, HelpYourSelfActivity::class.java)
        val intentToSixthScreen = Intent(this, IntentsActivity::class.java)
        val intentToSeventhScreen = Intent(this, LifecycleStateActivity::class.java)
        val intentToEighthScreen = Intent(this, ImplicitIntentsActivity::class.java)

        with(binding) {
            btnFor11.setOnClickListener {
                startActivity(intentToFirstScreen)
            }
            btnFor12.setOnClickListener {
                startActivity(intentToSecondScreen)
            }
            btnFor122.setOnClickListener {
                startActivity(intentToThirdScreen)
            }
            btnFor13.setOnClickListener {
                startActivity(intentToFourthScreen)
            }
            btnFor14.setOnClickListener {
                startActivity(intentToFifthScreen)
            }
            btnFor21.setOnClickListener {
                startActivity(intentToSixthScreen)
            }
            btnFor22.setOnClickListener {
                startActivity(intentToSeventhScreen)
            }
            btnFor23.setOnClickListener {
                startActivity(intentToEighthScreen)
            }
        }
    }
}