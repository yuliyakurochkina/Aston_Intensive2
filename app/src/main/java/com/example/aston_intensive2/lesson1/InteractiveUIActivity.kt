package com.example.aston_intensive2.lesson1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aston_intensive2.MainActivity
import com.example.aston_intensive2.R
import com.example.aston_intensive2.databinding.ActivityInteractiveUiBinding

class InteractiveUIActivity : AppCompatActivity() {
    private lateinit var binding2: ActivityInteractiveUiBinding
    private var mCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityInteractiveUiBinding.inflate(layoutInflater)
        val view = binding2.root
        setContentView(view)

        val intentMainActivity = Intent(this, MainActivity::class.java)

        binding2.btnForMainActivity.setOnClickListener {
            startActivity(intentMainActivity)
        }

        binding2.buttonToast.setOnClickListener {
            showToast(view)
        }

        binding2.buttonCount.setOnClickListener {
            countUp(view)
        }

    }

    fun showToast(view: View) {
        val toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT)
        toast.show()
    }

    fun countUp(view: View) {
        mCount++
        binding2.showCount.text = mCount.toString()
    }
}