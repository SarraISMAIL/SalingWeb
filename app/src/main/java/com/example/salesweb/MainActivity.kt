package com.example.salesweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var login_signup =findViewById<TextView>(R.id.login_signup)

        login_signup.setOnClickListener{
            val i = Intent(this,   RegAct::class.java)
            startActivity(i)

        }
    }
}