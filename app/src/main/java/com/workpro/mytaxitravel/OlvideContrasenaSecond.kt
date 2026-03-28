package com.workpro.mytaxitravel

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OlvideContrasenaSecond : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_olvide_contrasena2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val logInForgot = findViewById<Button>(R.id.btnLogInForgot);
        val backForgot = findViewById<Button>(R.id.btnBackForgot);

        logInForgot.setOnClickListener {
            logIn()
        }
        backForgot.setOnClickListener {
            back()
        }
    }

    fun logIn(){
        val call = Intent(this, Home::class.java)
        startActivity(call)
        finishAffinity()
    }
    fun back(){
        val call = Intent(this, OlvideContrasena::class.java)
        startActivity(call)
    }

}