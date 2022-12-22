package com.example.aston_intensive2.lesson2

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ShareCompat
import com.example.aston_intensive2.MainActivity
import com.example.aston_intensive2.databinding.ActivityImplicitIntentsBinding

class ImplicitIntentsActivity  : AppCompatActivity() {

    private lateinit var binding: ActivityImplicitIntentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImplicitIntentsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intentMainActivity = Intent(this, MainActivity::class.java)

        with(binding) {
            btnBack.setOnClickListener {
                startActivity(intentMainActivity)
            }
            btnOpenWebsite.setOnClickListener {
                val url = editTxtWebsite.text.toString()
                val webpage = Uri.parse(url)
                val intent = Intent(Intent.ACTION_VIEW, webpage)
                startActivity(intent)

            }
            openLocationButton.setOnClickListener {
                val location = editTxtLocation.text.toString()
                val uri = Uri.parse("geo:0,0?q=$location")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
            btnShareTxt.setOnClickListener {
                val text = editTxtShare.text.toString()
                val mimeType = "text/plain"
                ShareCompat.IntentBuilder(this@ImplicitIntentsActivity)
                    .setType(mimeType)
                    .setChooserTitle("Share this text with: ")
                    .setText(text)
                    .startChooser()
            }
            btnTakePhoto.setOnClickListener {
                takePhoto(view)
            }
        }
    }
    private fun takePhoto (view: View){
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivity(intent)
    }
}