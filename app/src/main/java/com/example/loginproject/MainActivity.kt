package com.example.loginproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var btnSingup:Button
    lateinit var etEmail:EditText
    lateinit var etPassword:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        }
    fun castView(){
        btnSingup=findViewById(R.id.btnSingup)
        var email=etEmail.text.toString()
        if (email.isEmpty()){
            etEmail.setError("Email required")
        }
        var  password=etPassword.text.toString()
        if (password.isEmpty()){
            etPassword.setError("Password required")
        }
        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)
    }
    fun onClick(){
        btnSingup.setOnClickListener {
            val init=Intent(baseContext,Signup::class.java)
            startActivity(init)

            }
        }
    }






