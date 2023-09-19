package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.MainActivity.Companion.EXTRA_EMAIL
import com.example.myapplication.MainActivity.Companion.EXTRA_NAME
import com.example.myapplication.MainActivity.Companion.EXTRA_PHONE
import com.example.myapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username2 = intent.getStringExtra(EXTRA_NAME)
        val email2 = intent.getStringExtra(EXTRA_EMAIL)
        val phone2 = intent.getStringExtra(EXTRA_PHONE)
        with(binding) {
            kalimatUsername.text = "Welcome $username2 "
            kalimatEmail.text = "Your $email2 has been activated"
            kalimatPhone.text = "Your phone number $phone2 has been registered"

            buttonLogout.setOnClickListener{
                finish();
            }
        }

    }
}



































































































































































































