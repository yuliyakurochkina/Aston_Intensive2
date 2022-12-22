package com.example.aston_intensive2.lesson1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aston_intensive2.MainActivity
import com.example.aston_intensive2.R
import com.example.aston_intensive2.databinding.ActivityLayoutEditorBinding

class LayoutEditorActivity: AppCompatActivity() {
    private lateinit var binding3: ActivityLayoutEditorBinding
    private var mCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding3 = ActivityLayoutEditorBinding.inflate(layoutInflater)
        val view = binding3.root
        setContentView(view)

        val intentMainActivity = Intent(this, MainActivity::class.java)

        binding3.btnForMainActivity.setOnClickListener {
            startActivity(intentMainActivity)
        }

        binding3.buttonToast.setOnClickListener {
            showToast(view)
        }

        binding3.buttonZero.setOnClickListener {
            showZero(view)
            changeZeroColor(view)
        }

        binding3.buttonCount.setOnClickListener {
            countUp(view)
            changeCountColor(view)
            changeZeroColor(view)
        }

    }
    fun showToast(view: View) {
        val toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT)
        toast.show()
    }

    private fun showZero(view: View) {
        mCount = 0
        binding3.showCount.text = mCount.toString()
    }

    fun countUp(view: View) {
        mCount++
        binding3.showCount.text = mCount.toString()
    }

    private fun changeCountColor(view: View) {
        if (mCount % 2 == 0) {
            binding3.buttonCount.setBackgroundColor(Color.BLUE)
        } else {
            binding3.buttonCount.setBackgroundColor(Color.GREEN)
        }
    }

    private fun changeZeroColor(view: View) {
        if (mCount > 0) {
            binding3.buttonZero.setBackgroundColor(Color.MAGENTA)
        } else if (mCount == 0) {
            binding3.buttonZero.setBackgroundColor(Color.GRAY)
        }
    }
}