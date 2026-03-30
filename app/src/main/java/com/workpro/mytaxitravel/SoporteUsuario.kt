package com.workpro.mytaxitravel

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class SoporteUsuario : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_soporte_usuario)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Obtenemos el nav
        val navView = findViewById<BottomNavigationView>(R.id.nav_view)
        // Seleccionamos el botón a sostener
        navView.selectedItemId = R.id.navigation_user

        navView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    startActivity(Intent(this, Home::class.java))
                    true
                }

                R.id.navigation_travel -> {
                    startActivity(Intent(this, Viajes::class.java))
                    true
                }

                R.id.navigation_user -> true

                else -> false
            }
        }


        // Boton de preguntas frecuentes
        val btnQuestions = findViewById<LinearLayout>(R.id.btnQuestions).setOnClickListener {
            val call = Intent(this, PreguntasFrecuentes::class.java)
            startActivity(call)
        }


        // Boton para retroceder a la seccion de Usuario
        val btnBackSeccion = findViewById<LinearLayout>(R.id.btnBackSeccion).setOnClickListener {
            val call = Intent(this, Usuario::class.java)
            startActivity(call)
        }
    }
}