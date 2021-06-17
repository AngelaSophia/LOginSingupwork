package com.example.loginproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.*

class Signup : AppCompatActivity() {
    lateinit var btnlogin:Button
    lateinit var etName:EditText
    lateinit var spGender:Spinner
    lateinit var etEmail:EditText
    lateinit var etPhone:EditText
    lateinit var etPassword:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }
    fun castView (){
        btnlogin=findViewById(R.id.btnLogin)
        etEmail=findViewById(R.id.etEmail)
        etName=findViewById(R.id.etName)
        etPhone=findViewById(R.id.etPhone)
        etPassword=findViewById(R.id.etPassword)
        spGender=findViewById(R.id.spGender)
        var  gender= arrayListOf("select gender","Male","Female")
        var  genderadaptor=ArrayAdapter<String>(baseContext,android.R.layout.simple_spinner_item,gender)
        genderadaptor.setDropDownViewResource(android.R.layout.simple_spinner_item)
        spGender.adapter=genderadaptor
    }
    fun onClick(){
        var name=etName.text.toString()
        if (name.isEmpty()){
            etName.setError("Name required")
        }
        var gender=""
        if (spGender.selectedItemPosition!=0){
            gender=spGender.selectedItem.toString()
        }
        else{
            Toast.makeText(baseContext,"select gender",Toast.LENGTH_LONG)
        }
        var  email=etEmail.text.toString()
        if (email.isEmpty()){
            etEmail.setError("Email required")
        }
        var phone=etPhone.text.toString()
        if (phone.isEmpty()){
            etPhone.setError("Phone required")
        }
        var  password=etPassword.text.toString()
        if (password.isEmpty()){
            etPassword.setError("Paswword required")
        }
        val  init=Intent(baseContext,MainActivity::class.java)
        startActivity(init)

    }
}