package com.example.aston_intensive2.lesson2.intents

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aston_intensive2.MainActivity
import com.example.aston_intensive2.R
import com.example.aston_intensive2.databinding.ActivityIntentsBinding

class IntentsActivity : AppCompatActivity() {

    private var mCount: Int = 0

    companion object {
        const val EXTRA_MESSAGE = "EXTRA_MESSAGE"
    }

    private lateinit var binding: ActivityIntentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intentMainActivity = Intent(this, MainActivity::class.java)

        with(binding) {
            btnBack!!.setOnClickListener {
                startActivity(intentMainActivity)
            }
            buttonCount?.setOnClickListener {
                countUp(view)
                changeCountColor(view)
            }
            buttonToast!!.setOnClickListener {
                sayHello(showCount!!.text.toString())
                showToast(view)
            }
        }
    }

    private fun changeCountColor(view: View) {
        if (mCount % 2 == 0) {
            binding.buttonCount?.setBackgroundColor(Color.BLUE)
        } else {
            binding.buttonCount?.setBackgroundColor(Color.GREEN)
        }
    }

    fun countUp(view: View) {
        mCount++
        binding.showCount?.text = mCount.toString()
    }

    private fun sayHello(data: String) {
        val intent = Intent(this, IntentsSecondActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, data)
        }
        startActivity(intent)
    }

    fun showToast(view: View) {
        val toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT)
        toast.show()
    }
}

