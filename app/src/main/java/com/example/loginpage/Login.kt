package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView

class Login : AppCompatActivity() {

    lateinit var textview:TextView
    lateinit var textview2:TextView
    lateinit var edtemail:EditText
    lateinit var edtpassword:EditText
    lateinit var btnlogin:Button
    lateinit var txtacc:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        textview = findViewById(R.id.textView)
        textview2 = findViewById(R.id.textView2)
        edtemail = findViewById(R.id.edtemail)
        edtpassword = findViewById(R.id.edtpassword)
        btnlogin = findViewById(R.id.btnlogin)
        txtacc = findViewById(R.id.txtacc)

        txtacc.setOnClickListener {
            val intent = Intent(this,Register::class.java)
            startActivity(intent)
            finish()
        }

        btnlogin.setOnClickListener {
            
            var email: String = edtemail.text.toString()
            var password: String = edtpassword.text.toString()
            
            var intent = Intent(this,MainActivity::class.java)
            
            intent.putExtra("email",email)
            intent.putExtra("Password",password)
            startActivity(intent)
//            finish()
        }
    }

}