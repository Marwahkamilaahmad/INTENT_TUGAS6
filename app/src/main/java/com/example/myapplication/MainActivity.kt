package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            buttonRegister.setOnClickListener{
                val intentToSecondActivity = Intent(this@MainActivity, SecondActivity::class.java)
                val username = Text1.text.toString()
                intentToSecondActivity.putExtra(EXTRA_NAME,username)
                val email = Text2.text.toString()
                intentToSecondActivity.putExtra(EXTRA_EMAIL,email)
                val phone = Text3.text.toString()
                intentToSecondActivity.putExtra(EXTRA_PHONE,phone)
                startActivity(intentToSecondActivity)

            }
        }







    }
}