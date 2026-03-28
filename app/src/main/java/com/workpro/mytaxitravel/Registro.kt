package com.workpro.mytaxitravel

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class Registro : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_activity3_registro)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Logica de los Botones
        val bBackRegister = findViewById<Button>(R.id.btnCancelRegister);
        val bNextRegister = findViewById<Button>(R.id.btnNextRegister);
        bBackRegister.setOnClickListener {
            goToBackLogin()
        }
        bNextRegister.setOnClickListener {
            goToNextRegister()
        }
    }

    fun goToBackLogin(){
        val call = Intent(this, MainActivity::class.java)
        startActivity(call);
    }

    fun goToNextRegister(){
        val call = Intent(this, RegistroSecond::class.java)
        startActivity(call);
    }
}