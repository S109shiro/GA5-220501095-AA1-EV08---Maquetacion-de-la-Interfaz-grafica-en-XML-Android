package com.workpro.mytaxitravel

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.widget.Button

class CalificacionViaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calificacion_viaje)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Obtenemos el nav
        val navView = findViewById<BottomNavigationView>(R.id.nav_view)
        // Seleccionamos el botón a sostener
        navView.selectedItemId = R.id.navigation_travel
        navView.setOnItemSelectedListener { item ->
            when (item.itemId) {

                R.id.navigation_home -> {
                    startActivity(Intent(this, Home::class.java))
                    true
                }
                R.id.navigation_travel -> true
                R.id.navigation_user -> {
                    startActivity(Intent(this, Usuario::class.java))
                    true
                }
                else -> false
            }
        }

        val btSaveCom = findViewById<Button>(R.id.btnSaveCommentary)
        btSaveCom.setOnClickListener {
            saveCommentary()
        }

    }

    fun saveCommentary(){
        val call = Intent(this, Home::class.java)
        startActivity(call)
        finishAffinity()
    }
}