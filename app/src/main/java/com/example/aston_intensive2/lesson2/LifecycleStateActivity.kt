package com.example.aston_intensive2.lesson2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.aston_intensive2.MainActivity
import com.example.aston_intensive2.databinding.ActivityLifecycleStateBinding

class LifecycleStateActivity : AppCompatActivity() {

    private var mCount: Int = 0

    companion object {
        const val KEY_NUMBER = "EXTRA_MESSAGE"
    }

    private lateinit var binding: ActivityLifecycleStateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLifecycleStateBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intentMainActivity = Intent(this, MainActivity::class.java)

        with(binding) {
            btnBack.setOnClickListener {
                startActivity(intentMainActivity)
            }
            btnCount.setOnClickListener {
                countUp(view)
            }
        }

        if(savedInstanceState != null){
            mCount = savedInstanceState.getInt(KEY_NUMBER)
            binding.showCount.text = mCount.toString()
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(KEY_NUMBER, mCount)
        super.onSaveInstanceState(outState)
    }

    fun countUp(view: View) {
        mCount++
        binding.showCount.text = mCount.toString()
    }
}