package com.example.moviematchk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var login_btn :Button
    private lateinit var username_et : EditText
    private lateinit var psw_et : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_btn = findViewById(R.id.login_btn);
        username_et = findViewById(R.id.username_et)
        psw_et = findViewById(R.id.psw_et)

        login_btn.setOnClickListener {
            Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show()
        }




    }
}