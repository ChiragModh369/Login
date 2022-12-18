package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    lateinit var txtDisplay:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtDisplay = findViewById(R.id.txtDisplay)

        var email:String = getIntent().getStringExtra("email").toString()
        var password:String = getIntent().getStringExtra("Password").toString()
        Log.d("debug","Thiis is email : $email !!! This is Your Password : $password")

        txtDisplay.setText("Hello $email !!! This is Your Password : $password")

    }
}