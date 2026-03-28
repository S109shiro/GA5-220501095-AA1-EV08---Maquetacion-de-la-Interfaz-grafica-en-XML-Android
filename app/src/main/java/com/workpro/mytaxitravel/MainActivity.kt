package com.workpro.mytaxitravel

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Obtencion de los botones de esta Activity
        val bLogin = findViewById<Button>(R.id.buttonLogin)
        val bCreate = findViewById<Button>(R.id.buttonCreate)

        // Codificar eventos al oprimir llamen una funcion
        bLogin.setOnClickListener {
            goToLogin()
        }
        bCreate.setOnClickListener {
            goToCreate()
        }
    }

    // Funciones que inician activity
    private fun goToLogin() {
        val call = Intent(this, ActivityLogin::class.java)
        startActivity(call)
    }
    private fun goToCreate(){
        val call = Intent(this, MainActivity3_Registro::class.java)
        startActivity(call)
    }
}