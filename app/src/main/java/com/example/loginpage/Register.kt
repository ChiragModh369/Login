package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView

class Register : AppCompatActivity() {

    lateinit var textview:TextView
    lateinit var textview2:TextView
    lateinit var edtfullname:EditText
    lateinit var edtemail:EditText
    lateinit var edtpassword:EditText
    lateinit var edtphone:EditText
    lateinit var btnregister:Button
    lateinit var txtacc:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        textview = findViewById(R.id.textView)
        textview2 = findViewById(R.id.textView2)
        edtfullname = findViewById(R.id.edtfullname)
        edtemail = findViewById(R.id.edtemail)
        edtpassword = findViewById(R.id.edtpassword)
        edtphone = findViewById(R.id.edtphone)
        btnregister = findViewById(R.id.btnregister)
        txtacc = findViewById(R.id.txtacc)


        txtacc.setOnClickListener {
            val intent = Intent(this,Login::class.java)
            startActivity(intent)
            finish()
        }


    }
}