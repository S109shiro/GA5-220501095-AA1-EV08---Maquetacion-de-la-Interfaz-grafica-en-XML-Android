package com.workpro.mytaxitravel

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class ActivityLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_activity2_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //obtencion de los botones del activity
        val loginBBack = findViewById<Button>(R.id.buttonLBack);
        val loginBNext = findViewById<Button>(R.id.buttonLNext)

        loginBBack.setOnClickListener {
            goToBack();
        }

        loginBNext.setOnClickListener {
            goToHome();
        }
    }
    private fun goToHome(){
        val call = Intent(this, Home::class.java);
        startActivity(call);
    }
    private fun goToBack(){
        val call = Intent(this, MainActivity::class.java);
        startActivity(call);
    }
}